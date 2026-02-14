package ArrayList;
import java.util.ArrayList;
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> li=new ArrayList<>(3);
        li.add("Hello");
        li.add("World");
        li.add("Java");
        System.out.println(li);
        for(int i=0;i<li.size();i++){
            String s=li.get(i);
            System.out.println(s);
        }
    }
}
