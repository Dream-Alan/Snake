package collectionUpdated.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<student,String>mp=new HashMap<>();
        student s1=new student("张三",18);
        student s2=new student("李四",19);
        student s3=new student("王五",20);
        student s4=new student("王五",20);
        mp.put(s1,"北京");
        mp.put(s2,"上海");
        mp.put(s3,"广州");
        mp.put(s4,"深圳");
        Set<Map.Entry<student,String>> set=mp.entrySet();
        for(Map.Entry<student,String> entry:set){
            System.out.println(entry.getKey().getName()+"\t"+entry.getKey().getAge()+"\t"+entry.getValue());
        }
    }
}
