package GUI;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PanelDemo1 {
    public static void main(String[] args) {
        Frame f=new Frame("Panel Demo");
        Panel p=new Panel();
        f.setBackground(Color.YELLOW);
        p.setBackground(Color.BLUE);
        f.add(p);
        f.setBounds(40,40,400,400);
        p.setBounds(50,50,300,300);
        f.setLayout(null);
        p.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
