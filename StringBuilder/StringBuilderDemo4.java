package StringBuilder;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        StringBuilder sb=new StringBuilder(change(arr));
        sb.append("---This is the result---");
        System.out.println(sb);
    }
    public static String change(int[] arr){
        String s=new String();
        for(int i=0;i<arr.length;i++){
            if(i==0){
                s+=("["+arr[i]);
            }else if(i==arr.length-1){
                s+=","+arr[i]+"]";
            }else{
                s+=","+arr[i];
            }
        }
        return s;
    }
}
