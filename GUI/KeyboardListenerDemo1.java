package GUI;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListenerDemo1 {
    public static void main(String[] args) {
    new MyKeyFrame();
    }
}
class MyKeyFrame extends Frame{
    public MyKeyFrame(){
        setBounds(200,200,400,400);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed( KeyEvent e) {
                int keyCode=e.getKeyCode();
                System.out.println(e.getKeyCode());
                if(keyCode==KeyEvent.VK_UP){
                    System.out.println("up");
                }

            }
        });
    }
}
