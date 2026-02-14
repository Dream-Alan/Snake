package collectionUpdated;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class listDemo2 {
    public static void main(String[] args) {
        List<student> li= new ArrayList<>();
        li.add(new student("A", 20));
        li.add(new student("B", 21));
        li.add(new student("C", 22));
        li.add(new student("D", 23));
        Iterator<student> it=li.iterator();
        for(int index=0;index<li.size();index++){
            student s=li.get(index);
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
