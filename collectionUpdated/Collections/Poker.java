package collectionUpdated.Collections;
import java.util.*;
public class Poker {
    public static void main(String[] args) {
        String[] colors={"♠","♥","♣","♦"};
        String[] numbers={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        List<String> list=new ArrayList<>();
        for (String number:numbers){
            for (String color:colors){
                list.add(color+number);
            }
        }
        list.add("JOKER");
        list.add("joker");
        System.out.println(list);
        Collections.shuffle(list);
        List<String> player1=new ArrayList<>();
        List<String> player2=new ArrayList<>();
        List<String> player3=new ArrayList<>();
        for (int i=0;i<list.size();i+=3) {
            player1.add(list.get(i));
            player2.add(list.get(i + 1));
            player3.add(list.get(i + 2));
        }
        System.out.println("player1:"+player1);
        System.out.println("player2:"+player2);
        System.out.println("player3:"+player3);

    }
}
