public class 两只老虎 {
    public static void main(String[] args){
        //定义两个变量,分别表示两只老虎的重量
        long one = 180;
        long two = 200;
        //用三元运算符比较体重,输出较大值
        int max = (int)((one > two) ? one : two);
        System.out.println("两只老虎中较重的那只体重为:" + max + "kg");
    }
}
