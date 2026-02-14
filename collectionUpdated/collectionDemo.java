package collectionUpdated;
import java.net.BindException;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class collectionDemo {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("A");
        c.add("B");
        c.add("C");
        Iterator<String>it= c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(c);
//        c.remove("C");
        System.out.println(c.contains("B"));
    }
}
