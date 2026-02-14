package MyMethod;

public class MethodDemo8 {
    public static void main(String[] args) {
        boolean result1 = compare((byte)1,(byte)2);
        System.out.println(result1);
        boolean result2 = compare((short) 12,(short) 24);
        System.out.println(result2);
        boolean result3 = compare( 34, 55);
        System.out.println(result3);
        boolean result4 = compare( 666666L, 666666L);
        System.out.println(result4);
    }
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a == b;
    }
    public static boolean compare(short a,short b) {
        System.out.println("short");
        return a == b;
    }
    public static boolean compare(int a,int b) {
        System.out.println("int");
        return a == b;
    }
    public static boolean compare(long a,long b) {
        System.out.println("long");
        return a == b;
    }
}
