//需求:任意给出一个数,判断它是奇数还是偶数,并输出在控制台
import java.util.Scanner;//导包
public class IfUsage{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//构建对象
        //定义变量
        System.out.println("请输入数字:");
        int a=sc.nextInt();
        //判断是否为偶数:变量a取余2为零
        if (a%2==0){
            System.out.println("该数字为偶数");
        } else {
            System.out.println("该数字为奇数");
        }
    }
}
