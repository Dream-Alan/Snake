package collectionUpdated;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
public class listIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
        System.out.println("Reverse order");
        while (lit.hasPrevious())
            System.out.println(lit.previous());
        while(lit.hasNext()){
            String s = lit.next();
            if(s.equals("C")){
                lit.add("X");
                System.out.println("Added X");
            }
        }
    }
}
