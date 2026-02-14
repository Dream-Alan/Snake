package teacherAndStudent;

public class teacher {
    public String name;
    public String age;
    public teacher(){

    }
    public teacher(String name,String age){
        this.name=name;
        this.age=age;
    }
    public void getName(String name){
        this.name=name;
        System.out.println("他的名字是"+name);
    }
    public void getAge(String age){
        this.age=age;
        System.out.println(name+"的年龄是"+age);
    }
    public void teach(String subject){
        System.out.println(name+"教"+subject);
    }
}
