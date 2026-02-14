package myInterface;

public class Dog extends Animal{
    public void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    public void jump() {
        System.out.println("Dog is jumping");
    }
}
