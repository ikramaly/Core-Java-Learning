package C5_Map;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMap {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new Hashtable<>();
        linkedHashMap.put(101,"Ikram");
        linkedHashMap.put(104,"Manisha");
        linkedHashMap.put(105,"Bobby Kumar");
        linkedHashMap.put(102,"Riya");
//        linkedHashMap.put(null,"Rehan");
        System.out.println(linkedHashMap);

//        System.out.println(linkedHashMap.values());
//        System.out.println(linkedHashMap.get(105));
//        System.out.println("------for loop used for one by one--------");
//
//        for (Map.Entry<Integer,String> entry : linkedHashMap.entrySet()){
//            System.out.println("Key : "+entry.getKey());
//            System.out.println("Value : "+entry.getValue());
//            System.out.println("-----------------------------");
//        }
//        System.out.println("-------------only keys ------------");
//        for (Integer entry : linkedHashMap.keySet()){
//            System.out.println("Key : "+entry);
//        }
//        System.out.println("-------only values-------------------");
//        for (String entry: linkedHashMap.values()){
//            System.out.println("Value : "+entry);
//        }
        int val = 80;
        char ch = (char) val;
        System.out.println(ch);
    }
}
