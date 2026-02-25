package MySnake;
import java.awt.*;
import javax.swing.*;
public class GamePanel extends JFrame {
    static final int CELL_SIZE = 20;
    static final int ROW = 22;
    static final int COL = 32;
    public GamePanel(){
        GameFrame();

    }


    public void GameFrame() {
        new JFrame();
        setSize(1000, 800);
        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        init();
    }
    public void init(){
        GameMap gameMap = new GameMap();
        this.add(gameMap,TOP_ALIGNMENT);
    }
}
class GameMap extends JPanel{
    public GameMap(){
        new JPanel();
        setBackground(Color.GRAY);
        setSize(GamePanel.CELL_SIZE*GamePanel.COL,GamePanel.CELL_SIZE*GamePanel.ROW);


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        for(int c=0;c<GamePanel.COL;c++){
            for(int r=0;r<GamePanel.ROW;r++){
                int x=c*GamePanel.CELL_SIZE;
                int y=r*GamePanel.CELL_SIZE;

                g.drawRect(x,y,GamePanel.CELL_SIZE,GamePanel.CELL_SIZE);
            }
        }
        for(int c=0;c<GamePanel.COL;c++){
            int x=c*GamePanel.CELL_SIZE;
            g.drawString("*",x+10,15);
        }
        for(int r=0;r<GamePanel.ROW;r++){
            int y=r*GamePanel.CELL_SIZE;
            g.drawString("*",10,y+15);
        }
        for(int c=0;c<GamePanel.COL;c++){
            int x=c*GamePanel.CELL_SIZE;
            g.drawString("*",x+15,22*GamePanel.CELL_SIZE-5);
        }
        for(int r=0;r<GamePanel.ROW;r++){
            int y=r*GamePanel.CELL_SIZE;
            g.drawString("*",32*GamePanel.CELL_SIZE-15,y+15);
        }
    }
}
