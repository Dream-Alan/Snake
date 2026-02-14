import java.util.Random;
import java.util.Scanner;
public class Guess{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int target=r.nextInt(100)+1;
        System.out.println("请输入你的猜想:");
        while(true){
            int guess=sc.nextInt();
            if (guess>target){
                System.out.println("这个数比它小");
                System.out.println("请再次输入你的猜想:");
            } else if (guess<target){
                System.out.println("这个数比它大");
                System.out.println("请再次输入你的猜想");
            } else {
                System.out.println("恭喜你答对了!!!");
                break;
            }
            //i+=0;//会进入死循环
        }
    }
}
