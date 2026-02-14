package Practice;

public class Practice7 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        if (isEqual(arr1, arr2)) {
            System.out.println("两个数组内容相等");
        } else {
            System.out.println("两个数组内容不相等");
        }
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1.length!=arr2.length) {
            return false;//当return语句结束后,方法也跟着结束,后面的代码不执行
        }
        for (int i=0;i<arr1.length;i++) {
            if (arr1[i] != arr2[i]) {
                return false;//当return语句结束后,方法也跟着结束,后面的代码不执行
            }
        }
        return true;         //当for循环结束后,证明上面的if语句没有执行,即数组内容相等
    }
}/*编译器考虑的特殊情况：

如果arr1.length是0，循环根本不会执行
        虽然你的代码逻辑看起来不会出现这种情况
但编译器必须考虑所有可能性
编译器的保守策略：

编译器采用"宁可错杀，不可放过"的策略
        它不会深入分析循环内部的复杂逻辑
只要发现存在没有返回值的路径，就会报错
*/




