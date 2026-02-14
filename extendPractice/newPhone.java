package extendPractice;

public class newPhone extends phone{

    public void call(String name){
        System.out.println("开启视频电话");
//        System.out.println("给"+name+"打电话");
        super.call(name);
    }
}
