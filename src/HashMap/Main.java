package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        /*
        HashMap = A data structure that stores key-value pairs
                  Keys are unique, but Values can be duplicated
                  Does not maintain any order, but is memory efficient
                  HashMap<Key, Value>
         */
        HashMap<String, Double> map = new HashMap<>();
        map.put("apple", 0.99);
        map.put("orange", 1.2);
        map.put("banana", 0.5);
        map.put("coconut", 2.0);
        map.remove("apple");
        System.out.println(map.get("orange"));
        System.out.println(map.containsKey("pineapple"));
        if(map.containsKey("orange")){
            System.out.println(map.get("orange"));
        }
        else {
            System.out.println("Key not found");
        }
        System.out.println(map.size());
        System.out.println(map);
        for(String key: map.keySet()){
            System.out.printf("%s : $ %.2f\n", key, map.get(key));
        }
    }
}
