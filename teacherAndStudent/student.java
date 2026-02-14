package teacherAndStudent;

public class student extends teacher {
    public student(){}
    public student(String name,String age){
        super.name=name;
        super.age=age;
    }
    public void getAge(String age){
        super.getAge(age);
    }
    public void getName(String name){
        super.getName(name);
    }
    public void study(String subject){
        System.out.println(name+"学"+subject);
    }
}
