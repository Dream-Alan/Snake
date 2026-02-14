package exception;

public class exceptionDemo {
    public static void main(String[] args){
        System.out.println("开始");
        try{int[]  arr=new int[]{1,2,3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

        System.out.println("结束");

    }
}
