package MyMethod;

public class MethodDemo6 {
    public static void main(String[] args) {
        int i=38;
        int j=45;
        int max=getMax(i,j);
        System.out.println("最大值是："+max);
        System.out.println("最大值是: "+getMax(i,j));
    }
    public static int getMax(int a,int b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }
}
