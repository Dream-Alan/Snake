package GUI;
import java.awt.*;
public class FrameDemo2 {
    public static void main(String[] args) {
        MyFrame f1= new MyFrame(100,100,200,200,Color.RED);
        MyFrame f2= new MyFrame(300,100,200,200,Color.BLUE);
        MyFrame f3= new MyFrame(300,300,200,200,Color.GREEN);
        MyFrame f4= new MyFrame(100,300,200,200,Color.PINK);
    }

}
class MyFrame extends Frame{
    static int count=0;
    public MyFrame(int x,int y,int width,int height,Color c){
        super("My Frame "+(++count));
        setBounds(x,y,width,height);
        setBackground(c);
        setVisible(true);
    }
}