package ArrayList;
import java.util.ArrayList;
public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Student> Info=new ArrayList<>();
        //创建学生对象
        Student s1=new Student();//这里的Student是类名,不是成员方法名,因此不能在括号里加东西,仅为创建对象
        Student s2=new Student();
        Student s3=new Student();
        s1.Student("张三", 18, "男");//这里的Student是成员方法名,因此可以加东西
        s2.Student("李四", 19, "女");
        s3.Student("王五", 20, "男");
        Info.add(s1);
        Info.add(s2);
        Info.add(s3);
        //遍历
        for(int i=0;i<Info.size();i++){
            Student s=Info.get(i);
            //System.out.println(s);这里直接用对象print的话,显示的是它的内存地址
            System.out.println(s.getName()+" "+s.getAge()+" "+s.getGender());
        }

    }
}
