package MyMethod;

public class MethodDemo5 {
    public static void main(String[] args) {
        int a=99;
        boolean b= isEvenNumber(a);
        System.out.println(b);
    }
    public static boolean isEvenNumber(int a){
        if (a%2==0){
            return true;
        }else {
            return false;
        }
    }
}


