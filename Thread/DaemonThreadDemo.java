package Thread;

public class DaemonThreadDemo {public static void main(String[] args) {
    // 创建一个线程
    Thread daemonThread = new Thread(() -> {
        int count = 0;
        // 这是一个无限循环，如果是用户线程，它会一直跑下去
        // 但因为它是守护线程，当 main 结束时，它也会被强制终止
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("守护线程正在运行... " + (++count));
        }
    });

    // 【关键】设置为守护线程
    daemonThread.setDaemon(true);

    // 启动线程
    daemonThread.start();

    System.out.println("主线程开始执行任务...");

    // 模拟主线程执行 3 秒后结束
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.println("主线程任务执行完毕，程序即将退出。");
}
}
