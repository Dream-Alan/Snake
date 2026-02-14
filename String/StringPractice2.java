package String;
import java.util.Scanner;
public class StringPractice2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int Caps=0;
        int caps=0;
        int numbers=0;
        for(int i=0;i<s.length();i++){
            char chr=s.charAt(i);
            if(chr>='A' && chr<='Z'){
                Caps++;
            }else if(chr>='a'&& chr<='z'){
                caps++;
            }else if(chr>='0' && chr<='9'){
                numbers++;
            }
        }
        System.out.println("大写字母数:"+Caps+" "+"小写字母数"+caps+" "+"数字数"+numbers);
    }
}
