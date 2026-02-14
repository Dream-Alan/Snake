package collectionUpdated.Map;
import java.util.*;
public class ShowUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> mp = new HashMap<>();
        System.out.println("请输入一个字符串：");
        String s = sc.next();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (mp.containsKey(c)) {
                    mp.put(c, mp.get(c) + 1);
                } else {
                    mp.put(c, 1);
                }
            }
            Set<Character> st = mp.keySet();
            for (Character c : st) {
                System.out.print(c + "(" + mp.get(c)+")");
            }
    }
}

