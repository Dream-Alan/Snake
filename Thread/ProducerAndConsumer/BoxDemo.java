package Thread.ProducerAndConsumer;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        Producer p = new Producer(box);
        Consumer c = new Consumer(box);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();

    }
}
