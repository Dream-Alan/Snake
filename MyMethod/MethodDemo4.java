package MyMethod;

public class MethodDemo4 {
    public static void main(String[] args) {
        //使用常量
        getmax(10,20);
        //使用方法时,方法要几个就给几个参数,方法要什么类型就给什么类型
        //使用变量
        int i=99;
        int v=53;
        getmax(i,v);
    }
    public static void getmax(int a, int b){
        int max=a>b?a:b;
        System.out.println(max);
    }
}
