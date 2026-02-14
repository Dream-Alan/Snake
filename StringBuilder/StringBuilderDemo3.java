package StringBuilder;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("hello").append("world");
        sb.toString();
        System.out.println(sb.toString());
        sb.append("java");
        String sb2=sb.toString();
        StringBuilder s=new StringBuilder(sb2);
        System.out.println(s);
    }
}
