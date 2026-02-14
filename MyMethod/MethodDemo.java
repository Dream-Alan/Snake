package MyMethod;

public class MethodDemo {
    public static void main(String[] args) {
        //调用方法
        isEvenNumber();

    }

    //定义一个方法
    public static void isEvenNumber(){
        //定义变量
        int i=75;
        if (i%2==0){
            System.out.println("这个数是偶数");
        } else{
            System.out.println("这个数是奇数");
        }
    }


}



