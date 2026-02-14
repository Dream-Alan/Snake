package collectionUpdated;
import java.util.ArrayList;
import java.util.List;

public class listDemo {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(1,5);
        System.out.println(li.remove(1));
        System.out.println(li);
    }
}