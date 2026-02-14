package array;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{24,69,80,57,13};
        System.out.println("排序前:"+arrayToString(arr));
        bubbleSort(arr);
        System.out.println("排序后:"+arrayToString(arr));
    }
    public static String arrayToString(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            if(i!=arr.length-1){
                sb.append(",");
            }else {
                sb.append("]");
            }
        }
        return sb.toString();
    }
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int x=0;x<arr.length-1;x++){
                if (arr[x]>arr[x+1]) {
                    int temp=arr[x];
                    arr[x]=arr[x+1];
                    arr[x+1]=temp;
                }
            }
        }
    }
}
