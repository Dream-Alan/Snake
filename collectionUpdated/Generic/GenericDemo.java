package collectionUpdated.Generic;

import sun.net.www.content.text.Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        generic<String> name= new generic<>();
        name.setT("张三");
        System.out.println(name.getT());
        generic<Double> a=new generic<Double>();
        a.setT(3.14);
        a.show();
        genericInterface s1=new genericImpl<>();
        s1.show("hello");
        s1.show(3.14);
        List<?> li=new ArrayList<Number>();
//        li.add(1);//编译错误
        List<? extends Number> li1=new ArrayList<Integer>();
        List<? super Number> li2=new ArrayList<Object>();
        sum(10,20,30,40,50,60,70,80,90,100,111,120,130,140);
    }
    public static void sum(int ... a){
        int num=0;
        for (int i:a) {
            num += i;
            System.out.println(num);
        }
    }
}
