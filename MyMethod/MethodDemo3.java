package MyMethod;

public class MethodDemo3 {
    public static void main(String[] args) {
        //常量值的调用
        isEvenNumber(10);
        //变量值的调用
        int b=10;
        isEvenNumber(b);

    }
    public static void isEvenNumber(int a){
        if (a % 2 == 0 ){
            System.out.println("都是偶数");
        } else {
            System.out.println("这个数是偶数");
        }
    }
}

