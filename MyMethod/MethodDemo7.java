package MyMethod;

public class MethodDemo7 {
    public static void main(String[] args) {
    //调用方法
        int sum1 = sum(10,20);
        System.out.println(sum1);
        double sum2 = sum(10.5,20.5);
        System.out.println(sum2);
        int sum3 = sum(10,20,30);
        System.out.println(sum3);
        //方法重载与返回值无关,调用时java虚拟机会根据参数类型和个数来调用对应的方法
    }
    //定义一个求两个整数和的方法
    public static int sum(int a,int b){
        return a+b;
    }
    //定义一个求两个浮点数和的方法
    public static double sum(double a,double b){
        return a+b;
    }
    //定义一个求三个整数和的方法
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
}
