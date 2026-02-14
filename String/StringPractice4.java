package String;
import java.util.Scanner;
public class StringPractice4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println(Reverse(s));
    }
    public static String Reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--) {
            rev += s.charAt(i);
        }
        return rev;
    }
}
