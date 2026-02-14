package Practice;
import java.util.Scanner;
public class Practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int t = 1;
        for (int i = 0;i < arr.length;t++, i++){
            System.out.println("请输入第" + t + "个评委打出的分数(1~100):");
            int score = sc.nextInt();
            arr[i] = score;
        }
        int max=getMax(arr);
        int min=getMin(arr);
        int sum=getSum(arr);
        int avg=(sum-max-min)/4;
        System.out.println("最后得分为:"+avg);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int getSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
