package MySnake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.ByteArrayOutputStream;
import java.util.LinkedList;

public class GamePanel extends JPanel implements ActionListener {

    // --- 基础配置 ---
    static final int TILE_SIZE = 25;
    static final int ROWS = 22;
    static final int COLS = 32;
    static final int SCREEN_WIDTH = COLS * TILE_SIZE;
    static final int SCREEN_HEIGHT = ROWS * TILE_SIZE;


    static final int EMPTY = 0;
    static final int WALL = 1;
    static final int SNAKE = 2;
    static final int FOOD = 3;


    static final int UP = 0;
    static final int DOWN = 1;
    static final int LEFT = 2;
    static final int RIGHT = 3;

    int[][] map = new int[ROWS][COLS];
    LinkedList<Point> snake;
    int Score = 0;
    int Speed=200;
    long startTime;
    int direction = RIGHT; // 初始方向向右
    boolean running = false;
    Timer timer;
    JFrame frame;
    public GamePanel() {
        frame=new JFrame("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.setVisible(true);
        frame.setVisible(true);
        frame.add(this);
        frame.pack();
        frame.setLocationRelativeTo(null);



        initMap();
        initSnake();

        Control();


        startGame(); // <--- 启动游戏



    }

    private void initMap() {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (r == 0 || r == ROWS - 1 || c == 0 || c == COLS - 1) {
                    map[r][c] = WALL;
                } else {
                    map[r][c] = EMPTY;
                }
            }
        }
    }

    private void initSnake() {
        snake = new LinkedList<>();
        // 头部(10,16)，身体向左延伸
        snake.add(new Point(16, 10));
        snake.add(new Point(15, 10));
        snake.add(new Point(14, 10));

        for (Point p : snake) {
            map[p.y][p.x] = SNAKE;
        }
    }


    public void startGame() {
        running = true;
        // 200ms 触发一次 actionPerformed，即蛇的速度
        this.startTime=System.currentTimeMillis();
        timer = new Timer(Speed, this);
        timer.start();


    }


    public void move() {

        if (!running) return;

        // 1. 获取当前蛇头
        Point head = snake.getFirst();
        Point newHead = new Point(head.x, head.y);

        // 2. 根据方向计算新蛇头位置
        switch (direction) {
            case UP:    newHead.y--; break;
            case DOWN:  newHead.y++; break;
            case LEFT:  newHead.x--; break;
            case RIGHT: newHead.x++; break;
        }

        // 如果新头的位置是墙，暂时先停止定时器，不让程序崩溃
        if (map[newHead.y][newHead.x] == WALL) {
            running = false;
            timer.stop();
            System.out.println("撞墙了！");
            countScore();

            return;
        }
        if (map[newHead.y][newHead.x] == SNAKE) {
            running = false;
            timer.stop();
            System.out.println("撞到自己了！");
            countScore();
            return;
        }
        // 3. 移动逻辑：加头去尾
        // 只有当尾巴不是新头所在位置时才清空（避免头尾重合时的闪烁bug）
        if (map[newHead.y][newHead.x] == FOOD) {
            // 吃到食物，不移除蛇尾，蛇变长
            snake.addFirst(newHead);
            map[newHead.y][newHead.x] = SNAKE;
            generateFood();
            Score += 10;

            if (Speed > 100) {
                Speed -= 10;
                timer.setDelay(Speed);
            }
        } else {
            snake.addFirst(newHead);
            map[newHead.y][newHead.x] = SNAKE;
            Point tail = snake.removeLast();// 没吃到食物，移除蛇尾
            map[tail.y][tail.x] = EMPTY;
        }
    }

    public void Control() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                switch (key) {
                    case KeyEvent.VK_UP:
                        if (direction != DOWN)
                            direction = UP;

                        break;
                    case KeyEvent.VK_DOWN:
                        if (direction != UP)
                            direction = DOWN;

                        break;
                    case KeyEvent.VK_LEFT:
                        if (direction != RIGHT)
                            direction = LEFT;

                        break;
                    case KeyEvent.VK_RIGHT:
                        if (direction != LEFT)
                            direction = RIGHT;
                        break;

                }
            }
        });
    }

    public void countScore(){
        Score=(snake.size()-3)*10;
        new exitDialog(frame,Score,startTime);
    }
    public void generateFood() {
        // 首先检查地图上是否已有食物
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (map[r][c] == FOOD) {
                    return; // 已有食物，不再生成新食物
                }
            }
        }

        int r, c;
        boolean validPosition;

        do {
            validPosition = true;
            // 生成随机位置，避免生成在边界上
            r = (int) (Math.random() * (ROWS - 2)) + 1;
            c = (int) (Math.random() * (COLS - 2)) + 1;

            // 检查位置是否为空
            if (map[r][c] != EMPTY) {
                validPosition = false;
            }
        } while (!validPosition);

        // 在空位置放置食物
        map[r][c] = FOOD;
    }


    @Override
    public void paintComponent(Graphics g) {
        generateFood();
        super.paintComponent(g);
        // 绘制网格线

        g.setColor(Color.DARK_GRAY);
        for (int r = 0; r <= ROWS; r++) {
            // 绘制水平网格线
            g.drawLine(0, r * TILE_SIZE, SCREEN_WIDTH, r * TILE_SIZE);
        }
        for (int c = 0; c <= COLS; c++) {
            // 绘制垂直网格线
            g.drawLine(c * TILE_SIZE, 0, c * TILE_SIZE, SCREEN_HEIGHT);
        }
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                int type = map[r][c];
                int x = c * TILE_SIZE;
                int y = r * TILE_SIZE;
                switch (type) {
                    case WALL:
                        g.setColor(Color.GRAY); // 设置 * 号的颜色
                        g.setFont(new Font("Monospaced", Font.BOLD, 20));

                        FontMetrics metrics = g.getFontMetrics(g.getFont());
                        int textWidth = metrics.stringWidth("*");

                        // 计算居中坐标 (数学公式：(格子宽度 - 文字宽度) / 2)
                        int drawX = x + (TILE_SIZE - textWidth) / 2;
                        int drawY = y + (TILE_SIZE - metrics.getHeight()) / 2 + metrics.getAscent();//metrics.getAscent()用于获取绘制基线高度,便于居中

                        // 用 * 渲染墙壁
                        g.drawString("*", drawX, drawY);
                        break;

                    case SNAKE:
                        g.setColor(Color.GREEN);
                        g.fillRect(x, y, TILE_SIZE, TILE_SIZE);
                        break;
                    case FOOD:
                        g.setColor(Color.RED);
                        g.fillOval(x, y, TILE_SIZE, TILE_SIZE);
                        break;
                }
            }
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {

            move();// 1. 算数据
            repaint();// 2. 画画面

        }
    }
}
class exitDialog extends JDialog {
    private JFrame parentFrame;
    Timer timer;
    public exitDialog(JFrame parentFrame,int score, long time) {
        new JDialog(parentFrame,"Game Over", true);
        setVisible(true);
        this.parentFrame= parentFrame;
        setLayout(new BorderLayout());
        setSize(300, 200);
        setLocationRelativeTo(parentFrame);

        Button b1 = new Button("Restart");
        b1.setBounds(50, 100, 50, 50);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            parentFrame.dispose();
            new GamePanel();
                dispose();

            }
        });
        Button b2 = new Button("Exit");
        b2.setBounds(100, 100, 50, 50);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(b1);
        add(b2);
        JLabel label = new JLabel("Final Score:" + score+"\t\t"+"Time:"+ (System.currentTimeMillis() - time) / 1000+"s");
        label.setFont(new Font("Arial",Font.BOLD,20));
        label.setSize(200, 50);
        add(label,BorderLayout.CENTER);

    }


}