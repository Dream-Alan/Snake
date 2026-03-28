package Thread;

public class MyThreadDemo2 {
    public static void main(String[] args) {
    MyThread t1 = new MyThread("plane");
    MyThread t2 = new MyThread("train");
    MyThread t3 = new MyThread("car");
    System.out.println(t1.getPriority());
    System.out.println(t2.getPriority());
    System.out.println(t3.getPriority());


    t1.start();
    try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    t2.start();
    t3.start();
    System.out.println(Thread.currentThread().getName());
}
}
