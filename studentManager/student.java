package studentManager;

public class student {
    private String sid;
    private String name;
    private String age;
    private String address;

    public student(){}//alt+insert:生成

    public student(String sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String setSid(String sid){
        this.sid=sid;
        return this.sid;
    }
    public String setName(String name){
        this.name=name;
        return this.name;
    }
    public String setAge(String age){
        this.age=age;
        return this.age;
    }
    public String setAddress(String address){
        this.address=address;
        return this.address;
    }
    public String getSid(){
        return sid;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

}
