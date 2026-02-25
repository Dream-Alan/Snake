package GUI;
import java.awt.*;
import java.awt.event.*;

public class GraphicDemo1 {
    public static void main(String[] args) {
        MyPaint mp=new MyPaint();
        mp.loadFrame();
    }
}
class MyPaint extends Frame{
    public void loadFrame(){
        setBounds(200,200,400,400);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawOval(100,100,200,200);
        g.fillOval(100,100,200,200);//填充椭圆
        g.setColor(Color.blue);
        g.fillRect(300,300,200,200);//填充矩形
    }
}