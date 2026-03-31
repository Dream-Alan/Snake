package Thread;

public class MyRunnableDemo1 {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            System.out.println("Child Thread");
        });
        t1.start();
        System.out.println("Main Thread");
    }
}
