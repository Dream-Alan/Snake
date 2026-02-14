package String;

public class StringPractice3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(together(arr));

    }
    public static String together(int[] arr){
        String s=new String();
        for (int i = 0; i < arr.length; i++){
            if (i==0){
                s+="["+arr[i];
            }else if (i==arr.length-1){
                s+=","+arr[i]+"]";
            }else {
                s+=","+arr[i];
            }
        }
        return s;
    }
}
