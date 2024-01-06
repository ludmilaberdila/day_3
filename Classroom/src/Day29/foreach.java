package Day29;

import java.util.ArrayList;
import java.util.List;

public class foreach {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(1,2,3,4,5));

        // regular for loop or i-loop
//        for (int i =0; i < integers.size(); i++){
//            System.out.println(integers.get(i) + " ");

            // foreach loop or Enhanced for loop
            for(Integer i: integers){
                System.out.println(i + " ");
            }
        }
        ArrayList<String> strings = new ArrayList<>(List.of("one", "two", "thre"));
        
    }

