package exception;

public class teacherTest {
    public static void main(String[] args) {
        teacher t=new teacher();
        try{
            t.checkScore(105);
        } catch (scoreException e) {
            throw new RuntimeException(e);
        }

    }
}
