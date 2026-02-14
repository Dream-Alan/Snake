package StringBuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
//        StringBuilder sb2=sb.append("hello");
//        System.out.println(sb==sb2);
//        System.out.println("sb:"+sb);
//        System.out.println("sb2:"+sb2);
        sb.append("hello").append("world").append("Java").append(100).append(true);//链式调用
        System.out.println(sb);
        //反转
        sb.reverse();
        System.out.println(sb);
    }
}
