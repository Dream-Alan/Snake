package StudentPrivate;

public class StudentTest {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("张三");
        s.setAge(30);
        s.study();
        s.doHomework();
        System.out.println(s.getName()+"  "+s.getAge()+"岁");
    }
}
