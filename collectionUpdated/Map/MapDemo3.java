package collectionUpdated.Map;
import java.util.*;

public class MapDemo3 {
    public static void main(String[] args) {
        ArrayList<Map>al=new ArrayList<>();
        Map<String,String>hm1=new HashMap<>();
        hm1.put("孙策","大乔");
        hm1.put("周瑜","小乔");
        Map<String,String>hm2=new HashMap<>();
        hm2.put("曹操","甄姬");
        hm2.put("刘备","孙尚香");
        Map<String,String>hm3=new HashMap<>();
        hm3.put("诸葛亮","黄月英");
        hm3.put("吕布","貂蝉");
        al.add(hm1);
        al.add(hm2);
        al.add(hm3);
        for (Map map:al){
            Set<Map.Entry<String,String>> st=map.entrySet();
            for (Map.Entry<String,String>me:st){
                System.out.println(me.getKey()+"---"+me.getValue());
            }
        }
    }
}
