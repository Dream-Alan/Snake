package MyArgs;

public class ArgsDemo4 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int max=getmax(arr);
        System.out.println("最大值为:"+max);
    }
    public static int getmax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
