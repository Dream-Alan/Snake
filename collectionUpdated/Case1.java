package collectionUpdated;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
public class Case1 {
    public static void main(String[] args) {
        student s1=new student("Alan",23);
        student s2=new student("Bob",22);
        student s3=new student("Clara",18);
        List<student> li=new ArrayList<>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        Iterator<student> it=li.iterator();
        ListIterator<student> lit=li.listIterator();

        for(int i=0;i<li.size();i++){
            student s=li.get(i);
            System.out.println(s.getName());
            System.out.println(s.getAge());
        }
        System.out.println("--------");
        for(student s: li){
            System.out.println(s.getName());
            System.out.println(s.getAge());
        }
        System.out.println("--------");
        while(lit.hasNext()){
            student s=lit.next();
            System.out.println(s.getName());
            System.out.println(s.getAge());
        }
    }
}
