package myAbstract;

public abstract class Animal {
    protected int age=12;
    public abstract void eat();
    public final void sleep(){
        System.out.println("睡觉");
    }
    public Animal(){}
    public Animal(int age){
        this.age=age;
    }
}
