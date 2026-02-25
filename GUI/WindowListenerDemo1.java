package GUI;
import java.awt.*;
import java.awt.event.*;

public class WindowListenerDemo1 {
    public static void main(String[] args) {
        Frame f = new Frame("WindowListenerDemo1");
        f.setSize(400, 300);
        Button b1= new Button("Click Me");
        f.add(b1);
        f.setVisible(true);
        b1.setActionCommand("button1-->Stop");
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closed.");
                System.exit(0);
            }
        });
        MyActionListener m2=new MyActionListener();
        b1.addActionListener(m2);
    }
}
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("The button is clicked."+e.getActionCommand());
    }
}
