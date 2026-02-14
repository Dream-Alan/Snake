package collectionUpdated.gradeCompare;
import java.util.Comparator;
import java.util.TreeSet;

public class gradeRank {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num=s2.getTotal()-s1.getTotal();
                int num2=num==0?s2.getChinese()-s1.getChinese():num;
                int num3=num2==0? s1.getName().compareTo(s2.getName()) :num2;
                return num3;
            }
        });
        Student s1=new Student("Zhang San",12,90,80);
        Student s2=new Student("Li Si",14,85,85);
        Student s3=new Student("Wang Wu",15,95,95);
        Student s4=new Student("A Liu",14,85,80);
        Student s5=new Student("A Liu",14,95,95);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student s:ts){
            System.out.println(s.getName()+"\t\t"+s.getTotal());
        }
    }
}
