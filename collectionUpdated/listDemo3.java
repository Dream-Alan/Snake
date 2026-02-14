package collectionUpdated;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
public class listDemo3 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        List<String> li=new ArrayList<>();
        li.add("A");
        li.add("B");
        li.add("C");
        li.add("D");
        ListIterator<String> lit=list.listIterator();
        ListIterator<String> lit1=li.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
        System.out.println("========");
        while(lit1.hasNext()){
            System.out.println(lit1.next());
        }
    }
}
