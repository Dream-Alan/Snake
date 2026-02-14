package ArrayList;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Double> array=new ArrayList<>();
        System.out.println(array.add(0.11));
        array.add(2.00);
        array.add(2, 1.00);
        System.out.println(array);
    }
}
