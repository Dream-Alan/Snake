package GUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

public class MouseListenerDemo1 {
    public static void main(String[] args) {
        MyFrame4 m4=new MyFrame4("画图");

    }
}
class MyFrame4 extends Frame{
    ArrayList points;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        Iterator it=points.iterator();
        while(it.hasNext()){
            Point p=(Point) it.next();
            g.fillOval(p.x,p.y,20,20);
        }
    }
    public void addPoint(Point p){
        points.add(p);
    }
    public MyFrame4(String s){
        super(s);
        setBounds(200,200,400,400);
        points=new ArrayList<>();
        this.addMouseListener(new MyMouseListener());
        setVisible(true);
    }
    private class MyMouseListener extends MouseAdapter {  // 定义一个私有内部类MyMouseListener，继承自MouseAdapter类
        @Override  // 重写父类的方法，表示这是一个覆盖父类mouseClicked方法的方法
        public void mousePressed(MouseEvent e) {  // 鼠标点击事件处理方法的开始，接收MouseEvent事件对象作为参数
            MyFrame4 Mf=(MyFrame4) e.getSource();
            Mf.addPoint(new Point(e.getX(),e.getY()));// 获取事件源并将其强制转换为MyFrame4类型的对象，存储在Mf变量中
              // 创建一个Point对象，表示鼠标点击的位置，存储在变量p中
            Mf.repaint();  // 调用MyFrame4对象的repaint方法，重新绘制窗口
        }
    }

}
