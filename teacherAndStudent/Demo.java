package teacherAndStudent;

public class Demo {
    public static void main(String[] args) {
        teacher t=new teacher();
        t.getName("张三");
        t.getAge("30");
        t.teach("java");
        student s=new student();
        s.getName("李四");
        s.getAge("20");
        s.study("java");
    }
}
