package athleteAndCoach;

public class basketballAthlete extends athlete{
    public basketballAthlete() {
    }

    public basketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("basketballAthlete eat");
    }

    @Override
    public void train() {
        System.out.println("basketballAthlete train");
    }
}
