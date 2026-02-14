package Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="闫伟";
        s.age=18;
        System.out.println(s.name+"  "+s.age+"岁");
        s.study();
        s.doHomework();
    }
}
