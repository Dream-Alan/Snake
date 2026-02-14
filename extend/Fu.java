package extend;

public class Fu {
    /*public Fu(){
        System.out.println("父类构造方法被调用");
    }
    */
/**
 * 父类的构造方法，用于初始化父类对象
 * @param age 表示年龄的参数，用于初始化父类对象的年龄属性
 */
    public Fu(int age){
    // 输出提示信息，表明父类带参构造方法被调用
        System.out.println("父类带参构造方法被调用");
    }
    public int age=40;
    public void show(){
        System.out.println("show方法被调用");
    }
}
