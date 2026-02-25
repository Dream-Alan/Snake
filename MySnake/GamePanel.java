package MySnake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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

    // --- 游戏状态控制 (新增) ---
    int direction = RIGHT; // 初始方向向右
    boolean running = false;
    Timer timer;

    public GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.setVisible(true);
        initMap();
        initSnake();
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

    // --- 新增：启动引擎 ---
    public void startGame() {
        running = true;
        // 200ms 触发一次 actionPerformed，即蛇的速度
        timer = new Timer(200, this);
        timer.start();
    }

    // --- 新增：核心移动逻辑 ---
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
            System.out.println("撞墙了！(暂时停止)");
            return;
        }

        // 3. 移动逻辑：加头去尾
        // 加头
        snake.addFirst(newHead);
        map[newHead.y][newHead.x] = SNAKE;

        // 去尾 (暂时还没写吃食物逻辑，所以每次移动必然去尾)
        Point tail = snake.removeLast();
        // 只有当尾巴不是新头所在位置时才清空（避免头尾重合时的闪烁bug）
        if (map[tail.y][tail.x] == SNAKE) {
            map[tail.y][tail.x] = EMPTY;
        }

        map[tail.y][tail.x] = EMPTY;

        map[newHead.y][newHead.x] = SNAKE;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                int type = map[r][c];
                int x = c * TILE_SIZE;
                int y = r * TILE_SIZE;
                switch (type) {
                    case WALL:
                        g.setColor(Color.GRAY); // 设置 * 号的颜色
                        g.setFont(new Font("Monospaced", Font.BOLD, 20));

                        // 为了让 * 号完美居中在格子里，我们需要测量一下字体的尺寸
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
            move();    // 1. 算数据
            repaint(); // 2. 画画面
        }
    }
}