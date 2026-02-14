package collectionUpdated;
import java.util.HashSet;
public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<student> hs=new HashSet<>();
        student s1=new student("张三",12);
        student s2=new student("李四",13);
        student s3=new student("王五",14);
        student s4=new student("王五",14);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        for(student s:hs){
            System.out.println(s.getName()+"\t"+s.getAge());
        }
    }
}
