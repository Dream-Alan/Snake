package athleteAndCoach;

public abstract class coach extends human {
    public coach(){}
    public coach(String name, int age) {
        super(name, age);
    }
    public abstract void teach(coach a);
}
