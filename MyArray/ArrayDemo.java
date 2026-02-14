package MyArray;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr =new int[3];
        /*左边:
        int说明了数据类型
        []说明是数组
        右边:
        new:为数组申请内存空间
        int[]说明数组数据类型为int
        3表示数组的长度,其实就是数组中元素个数

        */
        //输出数组名
        System.out.println(arr);//[I@7dc5e7b4
        //输出数组中元素
        System.out.println(arr[0]);//0
        System.out.println(arr[1]);//0
        System.out.println(arr[2]);//0
        //修改数组中元素
        arr[0]=100;
        arr[2]=200;
        System.out.println(arr[0]);//100
        System.out.println(arr[1]);//0
        System.out.println(arr[2]);//200
    }
}
