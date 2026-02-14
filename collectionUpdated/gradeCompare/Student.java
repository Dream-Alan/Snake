package collectionUpdated.gradeCompare;
import java.util.Comparator;

public class Student {
    private String name;
    private int age;
    private int Chinese;
    private int Math;
    private int Total;
    public Student(){}
    public Student(String name,int age,int Chinese,int Math){
        this.name=name;
        this.age=age;
        this.Chinese=Chinese;
        this.Math=Math;
        this.Total=Chinese+Math;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getChinese() {
        return Chinese;
    }
    public void setChinese(int chinese) {
        Chinese = chinese;
    }
    public int getMath() {
        return Math;
    }
    public void setMath(int math) {
        Math = math;
    }
    public int getTotal() {
        return Total;
    }
    public void setTotal(int total) {
        Total = total;
    }
}
