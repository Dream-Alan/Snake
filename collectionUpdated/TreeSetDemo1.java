package collectionUpdated;
import java.util.TreeSet;
import java.util.Comparator;
public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<student> ts=new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
                int num=s1.getAge()-s2.getAge();
                int num2=num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });
        student s1=new student("Zhang San",12);
        student s2=new student("Li Si",14);
        student s3=new student("Wang Wu",15);
        student s4=new student("A Liu",14);
        student s5=new student("A Liu",14);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for(student s:ts){
            System.out.println(s.getName()+"\t\t"+s.getAge());
        }
    }
}
