package collectionUpdated.Collections;
import  java.util.*;
public class CollectionsDemo2 {
    public static void main(String[] args) {
        List<student> li=new ArrayList<>();
        li.add(new student("Zhang Si",20));
        li.add(new student("Li Si",19));
        li.add(new student("Wang Wu",18));
        li.add(new student("Zhao Liu",17));
        li.add(new student("Liu Neng",17));
        Collections.sort(li, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                int num=o1.getAge()-o2.getAge();
                int num2=num==0?o1.getName().compareTo(o2.getName()):num;
                return num2 ;
            }
        });
        for (student s:li){
            System.out.println(s.getName()+"\t"+s.getAge());
        }
    }
}
