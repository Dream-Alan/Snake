package Phone;

public class Phone {
    //成员变量
    String brand;
    int price;
    //成员方法
    public void call(){
        System.out.println("打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
    public void show() {
        System.out.println("品牌：" + brand + " 价格：" + price);
    }
}
