package collectionUpdated;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class collectionDemo2 {
    public static void main(String[] args) {
        Collection<student> c=new ArrayList<student>();
        c.add(new student("A",1));
        c.add(new student("B",2));
        c.add(new student("C",3));
        Iterator<student> it=c.iterator();
        while(it.hasNext()){
            student s=it.next();
            System.out.println(s.getName()+"\t"+s.getAge());
        }
    }
}
