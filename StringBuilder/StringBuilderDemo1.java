package StringBuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("sb:"+sb);
        System.out.println("sb.length():"+sb.length());
        StringBuilder sb2= new StringBuilder();
        System.out.println("sb2:"+sb2);
        System.out.println("sb2.length():"+sb2.length());
    }
}
