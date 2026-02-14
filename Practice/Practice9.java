package Practice;

public class Practice9 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        /*int[]arr2=new int[5];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[arr.length-i-1];
            System.out.println("arr2["+i+"]="+arr2[i]);
        }*/
        /*for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }*/
        reverse(arr);
    }
    public static void reverse(int[] arr){
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
    }
}


