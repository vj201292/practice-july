package test;

//count word using a map

import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    public static void main(String[] args) {

        System.out.println( countFreq("This this is is done by Saket Saket"));
       
    }

    private static Map countFreq(String string) {

        String split[] = string.split(" ");
        Map<String, Integer> hMap = new HashMap<>();
        for (int i = 0; i <= split.length - 1; i++) {
            if (hMap.containsKey(split[i])) {
                Integer integer = hMap.get(split[i]);
                hMap.put(split[i],integer+1);
            }else{
                hMap.put(split[i],1);
            }

        }
        return hMap;


    }
}
