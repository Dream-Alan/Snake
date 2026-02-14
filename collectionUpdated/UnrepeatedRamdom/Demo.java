package collectionUpdated.UnrepeatedRamdom;
import java.util.Random;
import java.util.TreeSet;
public class Demo {
    public static void main(String[] args) {
        Random r=new Random();
        TreeSet<Integer> ts=new TreeSet<>();
        while(ts.size()<10){
            int num=r.nextInt(20)+1;
            ts.add(num);
        }
        for(int i:ts){
            System.out.println(i);
        }
    }
}
