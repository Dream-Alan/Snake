package GUI;
import java.awt.*;
public class FrameDemo1 {
    public static void main(String[] args) {
        Frame f=new Frame("My First Frame");
        f.setSize(500,500);
        f.setLocation(0,0);
        f.setLayout(null);
        f.setBackground(new Color(25, 207, 213));
        f.setVisible(true);
        f.setResizable(false);
    }
}
