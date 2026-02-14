package Practice;

import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入星期数:");
        int week=sc.nextInt();
        while (!loseWeight(week)){
            week=sc.nextInt();
        }
    }
    public static boolean loseWeight(int a) {
        switch (a){
            case 1:
                System.out.println("跑步");
                return true;
            case 2:
                System.out.println("游泳");
                return true;
            case 3:
                System.out.println("慢走");
                return true;
            case 4:
                System.out.println("动感单车");
                return true;
            case 5:
                System.out.println("拳击");
                return true;
            case 6:
                System.out.println("爬山");
                return true;
            case 7:
                System.out.println("好好吃一顿");
                return true;
            default:
                System.out.println("输入错误,请重新输入:");
                return false;
        }
    }
}

