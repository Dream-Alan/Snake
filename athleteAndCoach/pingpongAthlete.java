package athleteAndCoach;

public class pingpongAthlete extends athlete implements speakEnglish{
    public pingpongAthlete() {
    }

    public pingpongAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员"+"吃饭");
    }

    @Override
    public void train() {
        System.out.println("乒乓球运动员训练");
    }
}
