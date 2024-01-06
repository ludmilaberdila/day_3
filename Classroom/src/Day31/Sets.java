package Day31;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<String>strings = new HashSet<>(List.of("Mike", "David", "Jane","Ann", "Alex"));
        TreeSet<String >treeSet = new TreeSet<>(List.of("Mike", "David", "Jane","Ann", "Alex"));
        LinkedHashSet<String>linkedHashSet = new LinkedHashSet<>(List.of("Mike", "David", "Jane","Ann", "Alex"));
        System.out.println(strings);
        System.out.println(treeSet);
        System.out.println(linkedHashSet);

    }

}
