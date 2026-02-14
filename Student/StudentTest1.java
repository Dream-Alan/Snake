package Student;

public class StudentTest1 {
    public static void main(String[] args) {
    Student s1=new Student();
    Student s2=new Student();
    s1.name=("张三");
    s1.age=18;
    s2.name=("李四");
    s2.age=19;
    System.out.println(s1.name+"  "+s1.age+"岁");
    s1.study();
    s1.doHomework();
    System.out.println(s2.name+"  "+s2.age+"岁");
    s2.study();
    s2.doHomework();
    }
}
