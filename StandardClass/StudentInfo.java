package StandardClass;

public class StudentInfo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("John");
        s.setAge(20);
        s.show();
        Student s2=new Student("张三",18);
        s2.show();
    }

}
