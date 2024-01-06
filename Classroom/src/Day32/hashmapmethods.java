package Day32;

import java.util.HashMap;
import java.util.Map;

public class hashmapmethods {
    public static void main(String[] args) {
        HashMap<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "apple");
        fruits.put(2, "banana");
        fruits.put(3,"waretmelon");
        fruits.put(4, "strawbewry");
        fruits.put(5,"cherry");
        System.out.println(fruits);
        for(Map.Entry<Integer, String> entry : fruits.entrySet()){
            System.out.println("id = " + entry.getKey() + " fruits = " + entry.getValue());
        }
        for(Integer key : fruits.keySet()){
            System.out.println(key);
        }
        for (String value : fruits.values()){
            System.out.println(value);
        }
    }
}
