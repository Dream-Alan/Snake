package MySnake;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Snake {
    public static void main(String[] args) {
        JFrame frame=new JFrame("MySnake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setVisible(true);
        GamePanel GP=new GamePanel();
        frame.add(GP);
        frame.pack();

    }
}
