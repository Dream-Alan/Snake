package collectionUpdated;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class enhancedFor {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i: arr){
            System.out.println(i);
        }
        List<Integer> li= new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        for(Integer i:li){
            System.out.println(i);
        }
    }
}
