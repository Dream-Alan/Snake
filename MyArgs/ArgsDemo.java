package MyArgs;

public class ArgsDemo {
    public static void main(String[] args) {
        int number=100;
        System.out.println("Number is "+number);
        change(number);
        System.out.println("Number is "+number);
    }
    public static void change(int number){
        number=200;
    }
}
