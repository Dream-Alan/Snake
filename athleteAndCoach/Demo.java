package athleteAndCoach;

public class Demo {
    public static void main(String[] args) {
        basketballCoach a=new basketballCoach();
        a.setAge(30);
        a.setName("Tom");
        a.eat();
        a.teach(a);
        pingpongCoach b=new pingpongCoach();
        b.setAge(40);
        b.setName("Jerry");
        b.eat();
        b.teach(b);
        b.speak();
        basketballAthlete c=new basketballAthlete();
        c.setAge(20);
        c.setName("Mike");
        c.eat();
        c.train();
        pingpongAthlete d=new pingpongAthlete();
        d.setAge(25);
        d.setName("Tom");
        d.eat();
        d.train();
        d.speak();
    }
}
