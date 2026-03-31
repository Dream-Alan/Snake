package Thread.sellTicket;

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();
        Thread t1 = new Thread(sellTicket);
        Thread t2 = new Thread(sellTicket);
        Thread t3 = new Thread(sellTicket);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
