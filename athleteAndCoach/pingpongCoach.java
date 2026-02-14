package athleteAndCoach;

public class pingpongCoach extends coach implements speakEnglish{
    public pingpongCoach() {
    }

    public pingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃饭");
    }

    @Override
    public void teach(coach a) {
        System.out.println("乒乓球教练"+a.getName()+"教乒乓球");
    }
}
