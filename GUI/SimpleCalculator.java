package GUI;
import java.awt.*;
import java.awt.event.*;



/**
 * SimpleCalculator类，实现一个简单的计算器界面
 */
public class SimpleCalculator {
    /**
     * 构造方法，创建SimpleCalculator实例
     */
    public SimpleCalculator(){}
    /**
     * 主方法，程序入口
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 创建SimpleCalculator实例并加载界面
        SimpleCalculator Calculator=new SimpleCalculator();
        Calculator.loadFrame(Calculator);
}
    // 声明三个文本框组件
    TextField t1,t2,t3;
    /**
     * 加载计算器界面
     * @param Calculator SimpleCalculator实例，用于事件处理
     */
public void loadFrame(SimpleCalculator Calculator){
        // 创建窗口实例
    MyFrame3 f=new MyFrame3();
        // 创建等号按钮
    Button b=new Button("=");
        // 设置窗口布局为流式布局
    f.setLayout(new FlowLayout());
        // 创建加号标签
    Label l=new Label("+");
        // 创建三个文本框，并设置宽度为10个字符
    t1=new TextField(10);
    t2=new TextField(10);
    t3=new TextField(10);
        // 设置第三个文本框为只读
    t3.setEditable(false);
        // 为按钮添加事件监听器
    b.addActionListener(new MyActionListener4(Calculator));
        // 将组件添加到窗口中
    f.add(t1);
    f.add(l);
    f.add(t2);
    f.add(b);
    f.add(t3);

        // 调整窗口大小以适应所有组件
    f.pack();
}


}
/**
 * 自定义窗口类 MyFrame3，继承自 Frame 类
 * 用于创建一个可调整大小的计算器窗口
 */
class MyFrame3 extends Frame{
    /**
     * 构造方法，初始化计算器窗口
     * 设置窗口标题为 "Calculator"
     * 添加窗口关闭事件监听器，使窗口可以正常关闭
     * 设置窗口可调整大小并可见
     */
    public MyFrame3(){
        super("Calculator");  // 调用父类 Frame 的构造方法，设置窗口标题
        addWindowListener(new WindowAdapter() {  // 添加窗口事件监听器
            @Override
            public void windowClosing(WindowEvent e) {  // 重写窗口关闭事件处理方法
                System.exit(0);  // 当窗口关闭时，退出程序
            }
        });
        setResizable(true);  // 设置窗口可以调整大小
        setVisible(true);  // 设置窗口可见
    }
}

/**
 * 实现ActionListener接口的动作监听器类
 * 用于处理计算器的加法操作
 */
class MyActionListener4 implements ActionListener{
    // 声明SimpleCalculator类型的成员变量，用于引用计算器实例
    SimpleCalculator Calculator=null;

    /**
     * 构造函数
     * @param Calculator 接收SimpleCalculator类型的对象，用于初始化成员变量
     */
    public MyActionListener4(SimpleCalculator Calculator){
        this.Calculator=Calculator;  // 将传入的计算器实例赋值给成员变量

    }
    /**
     * 重写ActionListener接口的actionPerformed方法
     * 当事件发生时执行加法运算并清空输入框
     * @param e ActionEvent事件对象
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取第一个输入框的文本并转换为整数
        int i1=Integer.parseInt(Calculator.t1.getText());
        // 获取第二个输入框的文本并转换为整数
        int i2=Integer.parseInt(Calculator.t2.getText());
        // 将两个整数相加的结果设置到第三个输入框中
        Calculator.t3.setText(String.valueOf(i1+i2));
        // 清空第一个输入框
        Calculator.t1.setText("");
        // 清空第二个输入框
        Calculator.t2.setText("");

    }
}