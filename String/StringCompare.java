package String;

public class StringCompare {
    public static void main(String[] args) {
        char[] chr=new char[]{'c','a','t'};
        String s1=new String(chr);
        String s2=new String(chr);
        String s3="cat";
        String s4="cat";
        System.out.println(s1==s2);//false
        System.out.println(s3==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
