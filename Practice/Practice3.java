package Practice;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println("以下是敲七游戏的示范:");
        knockSeven(1);
    }
    public static void knockSeven(int n){
        for(n=1;n<=100;n++){
            if(n%10==7){
                System.out.println(n+"敲");
            }else if(n/10%10==7){
                System.out.println(n+"敲");
            }else if(n%7==0){
                System.out.println(n+"敲");
            }else{
                System.out.println(n);
            }
        }
    }
}
