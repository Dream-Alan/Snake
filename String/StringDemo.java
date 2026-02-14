package String;

public class StringDemo {
    public static void main(String[] args) {
        String s1=new String();
        System.out.println("s1="+s1);
        char[] chr=new char[]{'a','b','c'};
        String s2=new String(chr);
        System.out.println("s2="+s2);
        byte[] b=new byte[]{97,98,99};
        String s3=new String(b);
        System.out.println("s3="+s3);
        String s4="abc";
        System.out.println("s4="+s4);
        //推荐使用直接赋值的方式得到字符串
    }
}
