package GUI;
import java.awt.*;
public class LayoutDemo3 {
/**
 * 主方法，演示使用GridLayout布局管理器创建一个包含6个按钮的窗口
 * @param args 命令行参数
 */
    public static void main(String[] args) {
        // 创建一个标题为"LayoutDemo3"的窗口
        Frame f=new Frame("LayoutDemo3");
        // 创建6个按钮对象
        Button b1=new Button("Button1");
        Button b2=new Button("Button2");
        Button b3=new Button("Button3");
        Button b4=new Button("Button4");
        Button b5=new Button("Button5");
        Button b6=new Button("Button6");
        // 设置窗口的布局管理器为3行2列的网格布局
        f.setLayout(new GridLayout(3,2));
        // 将按钮添加到窗口中
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        // 自动调整窗口大小以适应其组件
        f.pack();
        // 设置窗口可见
        f.setVisible(true);

    }
}
