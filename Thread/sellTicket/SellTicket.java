package Thread.sellTicket;

public class SellTicket implements Runnable{
    private int ticket=100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出第" + ticket+ "张票");
                    ticket--;
                } else {
                    break;
                }
            }
        }

    }
}
