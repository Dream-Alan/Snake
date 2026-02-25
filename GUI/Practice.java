package GUI;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Practice {
/**
 * 主方法，创建一个带有多个面板和按钮的窗口界面
 * @param args 命令行参数
 */
    public static void main(String[] args) {
    // 创建一个名为"Practice"的窗口框架
        Frame f=new Frame("Practice");
    // 设置窗口大小为400x400像素
        f.setSize(400,400);
    // 创建四个面板
        Panel p1=new Panel();
        Panel p2=new Panel();
        Panel p3=new Panel();
        Panel p4=new Panel();


    // 设置各面板的布局管理器为网格布局
        p1.setLayout(new GridLayout(2,1));  // 2行1列
        p2.setLayout(new GridLayout(2,2));  // 2行2列
        p3.setLayout(new GridLayout(2,1));  // 2行1列
        p4.setLayout(new GridLayout(2,1));  // 2行1列


    // 设置各面板的位置和大小
        p1.setBounds(100,0,200,200);  // 顶部中间区域
        p2.setBounds(100,200,200,200); // 底部中间区域
        p3.setBounds(0,0,100,400);    // 左侧区域
        p4.setBounds(300,0,100,400);   // 右侧区域
    // 设置面板背景颜色
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.RED);
    // 创建10个按钮
        Button b1=new Button("Button1");
        Button b2=new Button("Button2");
        Button b3=new Button("Button3");
        Button b4=new Button("Button4");
        Button b5=new Button("Button5");
        Button b6=new Button("Button6");
        Button b7=new Button("Button7");
        Button b8=new Button("Button8");
        Button b9=new Button("Button9");
        Button b10=new Button("Button10");
    // 将面板添加到窗口
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
    // 将按钮添加到对应的面板
        p1.add(b1);
        p1.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p3.add(b7);
        p3.add(b8);
        p4.add(b9);
        p4.add(b10);
    // 设置窗口布局为null，使用绝对定位
        f.setLayout(null);
    // 添加窗口关闭事件监听器
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    // 设置窗口可见
        f.setVisible(true);
    }
}
