package test;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("web", 1024);
        map.put("database", 2048);
        map.put("static", 5120);

        

        System.out.println(map.keySet());
        Collection<Integer> values = map.values();
        System.out.println(values);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> m = iterator.next();
            System.out.println(m.getKey()+"......"+m.getValue());
        }

        System.out.println("----------");
        map.forEach((key,val)-> System.out.println(key+"------"+val));


        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"======"+entry.getValue());
        }

    }
}
