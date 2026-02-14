package MyMethod;

public class MethodDemo2 {
    public static void main(String[] args) {
        getmax();
    }
    public static void getmax(){
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println("最大值是：" + max);
    }
}

