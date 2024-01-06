package Day29;

import java.util.HashSet;
import java.util.List;

public class hash {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("one");

        HashSet<String> set2 = new HashSet<>();
        set2.add("two");
        set2.add("three");
        set2.add("one");

        set.addAll(set2);
        set2.addAll(set);

        set.clear();

//        System.out.println("Set = " + set);
//        System.out.println(" set = " + set2);
//
        HashSet<Integer> integers1 = new HashSet<>(List.of(1,2,3));
        HashSet<Integer> integers2 = new HashSet<>(List.of(1,3,4));

        //integers2.retainAll(integers1);
        System.out.println(integers2);
        integers1.containsAll(integers2);

        System.out.println(integers2.remove(1));
        System.out.println(integers2);

    }
}
