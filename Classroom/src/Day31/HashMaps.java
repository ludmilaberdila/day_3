package Day31;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        ArrayList<Integer> main = new ArrayList<>(List.of(1,2,3,4,5));
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Mike", 20);
        map.put("John", 30);
        map.put("Alex", 15);
        map.put("Lisa", 50);
        map.put("Mike", 7);

        System.out.println(map);
        HashMap<String, String > capital = new HashMap<>();
        capital.put("England", "London");
        capital.put("Italy", "Rome");
        capital.put("Canada", "Ottawa");
        System.out.println(capital);

        HashMap<String, Double> fruits = new HashMap<>(){{
          put("Apple", 1.0);
          put("Banana", 2.0);
        }};
        System.out.println(fruits);

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("One", 1);

        System.out.println(numbers.containsKey("Four"));
        System.out.println(numbers.containsValue(1));

//        for(Map.Entry<String, Integer> i : numbers.entrySet()){
//            System.out.println(i.getKey() + " = " + i.getValue());
//        }
        Set < String> strings = numbers.keySet();
        for(Integer i : numbers.values()){
            System.out.println(i);
        }
    }
}
