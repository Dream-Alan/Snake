package MyArray;

public class ArrayDemo7 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr= new int[] {12,45,98,73,60};
        //求出数组中的最大值
        int max = arr[0];
        for(int i=1;i<arr.length;i++) {//i的取值范围是1~length-1
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        //求出数组中的最小值
        int min = arr[0];
        for(int i=1;i<arr.length;i++) {//i的取值范围是1~length-1
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
