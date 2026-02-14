package Practice;

import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入星期数:");
        int week = sc.nextInt();
        boolean b = loseWeight(week);
        while(b!=true){
            week=sc.nextInt();
            b=loseWeight(week);
        }
    }

    public static boolean loseWeight(int a) {
        if (a == 1) {
            System.out.println("跑步");
            return true;
        } else if (a == 2) {
            System.out.println("游泳");
            return true;
        } else if (a == 3) {
            System.out.println("慢走");
            return true;
        } else if (a == 4) {
            System.out.println("动感单车");
            return true;
        } else if (a == 5) {
            System.out.println("拳击");
            return true;
        } else if (a == 6) {
            System.out.println("爬山");
            return true;
        } else if (a == 7) {
            System.out.println("好好吃一顿");
            return true;
        } else {
            System.out.println("输入有误,请重新输入:");
            return false;
        }
    }
}



