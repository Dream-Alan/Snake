package Debug;

public class DebugDemo {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<11;i++){
            if (i%2==0){
                sum+=i;

            }
        }
        System.out.println("1~10之间的偶数和为:"+sum);
    }


}
