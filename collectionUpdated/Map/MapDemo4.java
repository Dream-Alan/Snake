package collectionUpdated.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<String,List<String>>mp=new HashMap<>();
        List<String>li1=new ArrayList<>();
        List<String>li2=new ArrayList<>();
        List<String>li3=new ArrayList<>();
        li1.add("张三");
        li2.add("李四");
        li3.add("王五");
        mp.put("北京",li1);
        mp.put("上海",li2);
        mp.put("广州",li3);
        for(String s:mp.keySet()){
            System.out.println(s+"---"+mp.get(s));
        }
        for(Map.Entry<String,List<String>> entry:mp.entrySet()){
            List<String> list=entry.getValue();
            for(String s:list){
                System.out.println(s+"---"+entry.getKey());
            }
        }
    }
}
