package GUI;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * LayoutDemo1 类是一个简单的布局演示类
 * 目前该类为空，仅作为示例展示类的定义
 */
public class LayoutDemo1 {
/**
 * Java程序主方法，创建一个简单的图形用户界面窗口
 * 包含两个按钮，并设置窗口的基本属性和事件监听
 */
    public static void main(String[] args) {
        // 创建一个Frame窗口对象
        Frame f=new Frame();
        // 创建两个按钮对象，分别显示"BUTTON1"和"BUTTON2"
        Button b1=new Button("BUTTON1");
        Button b2=new Button("BUTTON2");
        // 将按钮添加到窗口中
        f.add(b1);
        f.add(b2);
        // 设置窗口背景颜色为黄色
        f.setBackground(Color.yellow);
        // 设置窗口可以调整大小
        f.setResizable(true);
        // 设置窗口布局为流式布局(FlowLayout)
        f.setLayout(new FlowLayout());
        // 设置窗口大小为300x200像素
        f.setSize(300,200);
        // 设置窗口可见
        f.setVisible(true);
        // 设置按钮1的大小为100x50像素
        b1.setSize(100,50);
        // 设置按钮2的大小为100x50像素
        b2.setSize(100,50);
        // 添加窗口关闭事件监听器，当点击窗口关闭按钮时退出程序
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
