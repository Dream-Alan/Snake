package Debug;

import java.util.Scanner;
public class DebugDemo2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int one=sc.nextInt();
        System.out.println("请输入第二个整数：");
        int two=sc.nextInt();
        int max=getmax(one,two);
        System.out.println("最大值为："+max);
    }
    public static int getmax(int a,int b){
        return a>b?a:b;
    }
}
