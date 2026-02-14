package String;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String RightUsername="admin";
        String RightPassword="12345";
        System.out.println("请输入用户名:");
        String Username=sc.nextLine();
        System.out.println("请输入密码:");
        String Password=sc.nextLine();
        for(int i=0;i<3;i++){
            if(Username.equals(RightUsername)&&Password.equals(RightPassword)){
                System.out.println("登录成功,欢迎");
                break;
            }else if(i<=1){
                System.out.println("用户名或密码错误");
                System.out.println("您还有"+(2-i)+"次机会");
                System.out.println("请重新输入用户名:");
                Username=sc.nextLine();
                System.out.println("请重新输入密码:");
                Password=sc.nextLine();
            }else if(i==2){
                System.out.println("登录失败,请五分钟后重试");
            }
        }
    }
}
