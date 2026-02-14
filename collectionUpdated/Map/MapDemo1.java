package collectionUpdated.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,String>mp=new HashMap<>();
        mp.put("001","张三");
        mp.put("002","李四");
        mp.put("003","王五");
        Set<String>st=mp.keySet();
        for (String s:st) {
            System.out.println(s+"="+mp.get(s));
        }
        System.out.println("------------------------");
        Set<Map.Entry<String,String>> st1=mp.entrySet();
        for (Map.Entry o:st1) {
            System.out.println(o.getKey());
            System.out.println(o.getValue());

        }
    }
}
