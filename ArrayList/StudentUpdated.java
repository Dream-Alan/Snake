package ArrayList;

public class StudentUpdated {
    private String name;
    private String age;
    private String gender;
    public void StudentU(String name,String age,String gender){
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getAge() {
        return age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
}
