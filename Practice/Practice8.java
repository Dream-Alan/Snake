package Practice;
import java.util.Scanner;
public class Practice8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num=sc.nextInt();
        int[]arr={19,28,37,46,50};
        getIndex(arr,num);
        /*int index=-1;
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                index=i;
                System.out.println("该数据的索引是:"+index);
                break;
            }
        }
        if(index==-1) {
            System.out.println("该数据不存在");
        }*/
    }
    public static void getIndex(int[] arr,int num ){
         int index=-1;
         for (int i=0;i<arr.length;i++){
             if(num==arr[i]) {
                 index = i;
                 System.out.println("该数据的索引是:" + index);
                 break;
             }

         }
         if(index==-1) {
             System.out.println("该数据不存在");
         }
    }
}
