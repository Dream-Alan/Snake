package athleteAndCoach;

public abstract class athlete extends human{
    public athlete(){}
    public athlete(String name,int age){
        super(name,age);
    }
    public abstract void train();
}
