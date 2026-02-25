package GUI;
import java.awt.*;
import java.awt.event.*;


/**
 * WindowListenerDemo2 类是窗口监听器演示程序的主类
 * 该类创建了一个自定义的窗口框架实例
 */
public class WindowListenerDemo2 {
    /**
     * 程序的入口方法
     * @param args 命令行参数，在此程序中未使用
     */
    public static void main(String[] args) {
        // 创建 MyFrame2 的实例，显示自定义窗口
        new MyFrame2();

    }
}
/**
 * 继承自Frame的自定义窗口类MyFrame2
 * 创建一个带有密码输入框的窗口
 */
class MyFrame2 extends Frame {
    /**
     * 构造方法，初始化窗口并添加组件
     */
    public MyFrame2() {
        super(); // 调用父类Frame的构造方法
        // 创建文本框组件
        TextField tf = new TextField();
        add(tf); // 将文本框添加到窗口中
        // 创建动作监听器并添加到文本框
        MyActionListener2 ma2 = new MyActionListener2();
        tf.addActionListener(ma2);
        // 设置文本框的回显字符为'*'，用于密码输入
        tf.setEchoChar('*');
        // 添加窗口关闭事件监听器
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); // 当窗口关闭时退出程序
            }
        });
        // 设置窗口可调整大小
        setResizable(true);
        // 自动调整窗口大小以适应组件
        pack();
        // 设置窗口可见
        setVisible(true);
    }
}
/**
 * 实现ActionListener接口的自定义动作监听器类
 * 用于处理文本框的输入事件
 */
class MyActionListener2 implements ActionListener {
    /**
     * 重写actionPerformed方法，当动作事件发生时执行
     * @param e ActionEvent对象，包含事件的相关信息
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取事件源，并将其强制转换为TextField类型
        TextField t=(TextField) e.getSource();
        // 输出文本框中的内容到控制台
        System.out.println(t.getText());

    }
}
