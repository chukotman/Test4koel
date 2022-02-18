package lesson14;

import java.util.*;

public class App1 {
    public static void main(String[] args) {
        HashMap<String,String> capitals = new HashMap<>();

        capitals.put("Germany","Berlin");
        capitals.put("Greece","Athens");
        capitals.put("Turkey","Ankara");
        capitals.put("China","Beijing");
        capitals.put("Great Britain","London");

        System.out.println(capitals);

        capitals.put("Germany","Bonn");
        System.out.println(capitals);

        capitals.replace("Germany","Berlin");
        System.out.println(capitals);

        String value = capitals.get("Turkey");
        System.out.println(value);

        Map<Integer,String> colors = new HashMap<>();
        colors.put(0,"Red");
        colors.put(1,"Blue");
        colors.put(2,"Green");
        colors.put(3,"Red");

        System.out.println(colors.get(2));


//        Set<String> keys = capitals.keySet();
//        for (String key : keys){
//            System.out.println(key);
//        }
//        System.out.println(keys);
//        for (String key : capitals.keySet()){
//            System.out.println(key);
//        }
//        Collection<String> values = capitals.values();
//        for (String v: values){
//            System.out.println(v);
//        }
//        System.out.println(values);
//        for (String v : capitals.values()){
//            System.out.println(v);
//        }

//        for (Map.Entry<String,String> keyValuePair : capitals.entrySet()){
//            System.out.println(keyValuePair.getKey()+"="+keyValuePair.getValue());
//        }

//        for (String key : capitals.keySet()){
//            System.out.println(capitals.get(key));
//        }

        Map<Fruits,Trees> fruitsTreesMap = new HashMap<>();

        fruitsTreesMap.put(new Fruits(), new Trees());
    }
}
