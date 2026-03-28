package Thread;

public class MyThreadDemo1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("plane");
        MyThread t2 = new MyThread("train");
        MyThread t3 = new MyThread("car");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
        System.out.println(Thread.currentThread().getName());
    }
}
