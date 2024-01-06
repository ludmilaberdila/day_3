package Day29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercice {
    public static void main(String[] args) {
//        ArrayList<String > strings = new ArrayList<>(List.of("dog", "cat", "dog", "bird", "bird", "fish"));
//
//        HashSet<String> strings1 = new HashSet<>(List.of("dog", "cat", "dog", "bird", "bird", "fish"));
//        strings1.remove(strings);
//        System.out.println(strings1);
        HashSet<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        HashSet<Integer> set2 = new HashSet<>(List.of(4,5,6,7,8));
        //set1.retainAll(set2);
        System.out.println(set1); //print comon values

    }
}
