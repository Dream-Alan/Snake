package extend;

public class Zi extends Fu {
    public int height=175;
    public int age=20;
    public  void show(){
        super.show();
        System.out.println("Zi中show方法被调用");
    }
    public void method(){
        System.out.println("子类方法被调用");
    }
    public Zi(){
        super(20);
        System.out.println("子类构造方法被调用");
    }
    public Zi(int age) {
        super(30);
        System.out.println("子类带参构造方法被调用");
    }
}

