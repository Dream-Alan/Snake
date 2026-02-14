package StringBuilder;
import java.util.Scanner;
public class StringBuilderDemo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s=sc.nextLine();
        System.out.println("反转后的字符串为:"+reverse(s));
    }
    public static String reverse(String s){
//        StringBuilder sb=new StringBuilder(s);
//        sb.reverse();
//        return sb.toString();
        //以下为优化的代码
        return new StringBuilder(s).reverse().toString();
    }
}
