package exception;

public class teacher {
    public void checkScore(int score)throws scoreException{
        if(score<0 || score>100){
            throw new scoreException("分数必须在0-100之间");
        }else{
            System.out.println("分数正常");
        }
    }
}
