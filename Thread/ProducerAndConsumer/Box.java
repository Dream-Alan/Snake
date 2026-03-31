package Thread.ProducerAndConsumer;

/**
 * Box类实现了一个简单的牛奶箱，用于存放和取出牛奶
 * 使用同步机制确保线程安全，实现生产者-消费者模型
 */
public class Box {
    private int milk;            // 存储当前牛奶的编号
    private boolean condition=false;  // 标记箱子中是否有牛奶，false表示没有，true表示有
    /**
     * 向箱子中放入牛奶的方法
     * @param milk 牛奶的编号
     */
    public synchronized void put(int milk){
        // 如果箱子中已经有牛奶，则等待消费者取出
        if (condition){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        condition=true;           // 标记箱子中有牛奶
        this.milk=milk;          // 存入牛奶编号
        System.out.println("放入了第"+milk+"瓶牛奶");
        notify();                // 通知等待的消费者线程
    }
    /**
     * 从箱子中取出牛奶的方法
     */
    public synchronized void get(){
        // 如果箱子中没有牛奶，则等待生产者放入
        if (!condition){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        condition=false;          // 标记箱子为空
        int milk=this.milk;      // 获取牛奶编号
        System.out.println("取出了第"+milk+"瓶牛奶");
        notify();                // 通知等待的生产者线程
    }

}
/**
 * 生产者类，实现了Runnable接口，用于在生产者-消费者模型中生产数据
 */
class Producer implements Runnable{
    // Box类型的成员变量，用于与消费者共享数据
    private Box b;

    /**
     * 构造函数，初始化生产者
     * @param b Box对象，用于存储生产的数据
     */
    public Producer(Box b) {
        this.b = b;
    }

    /**
     * 实现Runnable接口的run方法，生产数据的主体逻辑
     * 循环10次，每次调用Box的put方法存储一个数字
     */
    @Override
    public void run() {
        // 循环10次，依次将0-9的数字存入Box
        for(int i=0;i<10;i++){
            b.put(i);
        }
    }
}
/**
 * 消费者类，实现Runnable接口，表示一个消费者线程
 */
class Consumer implements Runnable{
    private Box b; // Box类的引用，用于与生产者共享数据

    /**
     * 构造方法，初始化Consumer实例
     * @param b Box对象，用于获取数据
     */
    public Consumer(Box b) {
        this.b = b; // 将传入的Box对象赋值给成员变量b
    }

    @Override  // 表示重写父类的run方法
    public void run() {  // 实现Runnable接口的run方法，作为线程执行体
        while(true){  // 无限循环，持续消费数据
            b.get();  // 调用b对象的get方法，从Box中获取数据
        }
    }
}