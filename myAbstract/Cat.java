package myAbstract;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public Cat(){
        super(10);
    }
}
