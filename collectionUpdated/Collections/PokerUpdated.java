package collectionUpdated.Collections;
import java.util.*;
public class PokerUpdated {
    public static void main(String[] args) {
        HashMap<Integer,String> cards=new HashMap<>();
        cards.put(1,"JOKER");
        cards.put(2,"joker");
        List<String> colors=new ArrayList<>();
        colors.add("♠");
        colors.add("♥");
        colors.add("♣");
        colors.add("♦");
        List<String> numbers=new ArrayList<>();
        for (int i=2;i<=10;i++){
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        for (String color:colors){
            for (String number:numbers)
                cards.put(cards.size()+1,color+number);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<54;i++){
            list.add(i+1);
        }
        Collections.shuffle(list);
        TreeSet<Integer> player1=new TreeSet<>();
        TreeSet<Integer> player2=new TreeSet<>();
        TreeSet<Integer> player3=new TreeSet<>();
        for (int i=0;i< list.size();i+=3){
            player1.add(list.get(i));
            player2.add(list.get(i+1));
            player3.add(list.get(i+2));
        }
        System.out.println("player1:");
        lookCards(cards,player1);
        System.out.println("player2:");
        lookCards(cards,player2);
        System.out.println("player3:");
        lookCards(cards,player3);
    }
    public static void lookCards(HashMap<Integer,String> cards,TreeSet<Integer> player){
        System.out.print("[");
        for (Integer card:player) {
            System.out.print(cards.get(card));
        }
        System.out.print("]");
        System.out.println("--------");
    }
}
