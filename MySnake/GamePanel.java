package MySnake;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

import static jdk.nashorn.internal.codegen.ObjectClassGenerator.pack;
import static sun.dc.pr.Rasterizer.TILE_SIZE;

public class GamePanel extends JFrame {
    static final int CELL_SIZE = 20;
    static final int ROW = 22;
    static final int COL = 32;

    public GamePanel(){
        GameFrame();
    }


    public void GameFrame() {
        new JFrame();
        setSize(GamePanel.CELL_SIZE*GamePanel.COL+18,GamePanel.CELL_SIZE*GamePanel.ROW+4);
        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);

        init();
    }
    public void init(){
        GameMap gameMap = new GameMap();
        this.add(gameMap,TOP_ALIGNMENT);
    }
}
class GameMap extends JPanel{
    static final int EMPTY = 0;
    static final int WALL = 1;
    static final int SNAKE = 2;
    static final int FOOD = 3;
    public GameMap(){
        new JPanel();
        setBackground(Color.BLACK);
        setSize(GamePanel.COL*GamePanel.CELL_SIZE,GamePanel.ROW*GamePanel.CELL_SIZE);
        setLayout(null);
        int[] [] map = new int[GamePanel.COL][GamePanel.ROW];


    }

    @Override
    public void paint(Graphics g) {
        Random rd=new Random();
        super.paint(g);
        g.setColor(Color.WHITE);
        int[][] map = new int[32][22];

        for(int r=0;r<GamePanel.ROW;r++){
            for(int c=0;c<GamePanel.COL;c++){
                int x=c*GamePanel.CELL_SIZE;
                int y=r*GamePanel.CELL_SIZE;
                int type = map[c][r];
                if(c==0||c==31||r==0||r==21){
                    type=WALL;
                }else if(c==16&&r==10||c==15&&r==10||c==14&&r==10){
                    type=SNAKE;
                }else {
                    type=EMPTY;
                }
                switch (type) {
                    case WALL:
                        g.setColor(Color.GRAY); // 墙壁颜色
                        g.drawString("*",x+10, y+15);
                        break;
                    case SNAKE:
                        g.setColor(Color.GREEN); // 蛇还没出生，先写好逻辑
                        g.fillRect(x, y, TILE_SIZE, TILE_SIZE);
                        break;
                    case FOOD:
                        g.setColor(Color.RED);   // 食物
                        g.fillOval(x, y, TILE_SIZE, TILE_SIZE);
                        break;
                    // EMPTY (0) 就不画了，显示背景色黑色
                }
            }


        }

    }
}
