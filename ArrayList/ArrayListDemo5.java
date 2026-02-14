package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<StudentUpdated> InfoU=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        //创建学生对象
        for(int i=0;i<3;i++){
            StudentUpdated s=new StudentUpdated();
            System.out.println("请输入姓名,年龄,性别:");
            s.StudentU(sc.nextLine(),sc.nextLine(),sc.nextLine());
            InfoU.add(s);
        }
        for(int n=0;n<InfoU.size();n++){
            StudentUpdated s=InfoU.get(n);
            System.out.println(s.getName()+" "+s.getAge()+" "+s.getGender());
        }



    }
}
