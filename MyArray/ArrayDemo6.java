package MyArray;

public class ArrayDemo6 {
    public static void main(String[] args) {
        //进行数组的遍历(采用for循环实现)
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < arr.length; i++) {//i是索引，索引的范围是0~length-1
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
        //通用的遍历格式:for(int i=0;i<arr.length;i++){System.out.println(arr[i])
    }
}
