package GUI;
import java.awt.*;

public class LayoutDemo2 {
    public static void main(String[] args) {
        Frame f = new Frame("LayoutDemo2");
        f.setSize(400, 300);
        f.setLocation(100, 100);
        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");
        Button b3 = new Button("Button3");
        b1.setSize(100, 50);
        b2.setSize(100, 50);
        b3.setSize(100, 50);
        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.CENTER);
        f.add(b3, BorderLayout.SOUTH);
        f.setVisible(true);
    }
}
