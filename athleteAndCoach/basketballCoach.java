package athleteAndCoach;

public class basketballCoach extends coach{
    public basketballCoach(){}
    public basketballCoach(String name,int age){
        super(name,age);
    }

    @Override
    public void teach(coach a) {
        System.out.println("basketball coach"+a.getName()+"teach basketball");

    }

    @Override
    public void eat() {
        System.out.println("basketball coach eat");
    }
}
