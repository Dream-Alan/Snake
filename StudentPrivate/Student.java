package StudentPrivate;

public class Student {
    private String name;
    private int age;
    public Student(){

    }
    public Student(String name){
        System.out.println(name);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(this.age>=0&&this.age<=120){
            this.age=age;
        } else {
            System.out.println("输入错误");
        }

    }
    public int getAge(){
        return age;
    }
    public void study(){
        System.out.println(name+"在学习");
    }
    public void doHomework(){
        System.out.println(name+"在做作业");
    }
}
