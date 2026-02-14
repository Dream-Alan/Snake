package myInterface;

public class Cat implements Jumping{
    private String name;
    private int age;
    public Cat(){}
    public Cat(String name,int age){
        this.name=name;
        this.age=age;
    }


    @Override
    public void jump() {
        System.out.println("猫可以跳高");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
