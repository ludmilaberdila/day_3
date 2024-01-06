package Day28;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // arrau primitives
        int [] array  = {1,2,3,4,5};
       // array objects


       // array list  class
        ArrayList<Integer> arrayList = new ArrayList<>();

        // array can store only objects ,

      // how to declaire
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(200);
        arrayList.add(500);
        System.out.println(arrayList);

      // arrayList class method
        // 1. add ( element) > adds elem. to the end of your arrayList


        // add element to the specified index, (we inserting number)
        arrayList.add(2, 123);
        System.out.println(arrayList);

       //return element,
        System.out.println(arrayList.get(0) + " , " + arrayList.get(4));


     //return size of array
       // System.out.println(arrayList.size("size" + arrayList.size());

        // update a value of element at thespecified index
        arrayList.set(arrayList.size()-1, 1000);
        System.out.println("update arraiList" + arrayList);


     //6. remove element at the giving index
        arrayList.remove(3);
        System.out.println("remove from arrayList" + arrayList);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);

        arrayList2.remove(1);
        System.out.println(arrayList2);
        ArrayList<String> strList = new ArrayList<>();

       // arrayList.add("one");
        strList.add("two");
        strList.add("one");

        strList.remove("one");
        System.out.println(strList);


        ArrayList<String> strList2 = new ArrayList<>();
         strList2.add("mike");
         strList2.add("lisa");
         strList2.add("ana");
        System.out.println(strList2.contains("mike"));


        ArrayList<String> strlist3 = new ArrayList<>(List.of("laptop", "comp" , "smartph" , "smartph" , "smartph"));
        System.out.println(strlist3.indexOf("index of smartph"+ strlist3.indexOf("smartph")));
        System.out.println("last index of smartph" + strlist3.lastIndexOf("smartph"));


        // remuve all elment from
        strlist3.clear();
        System.out.println(strlist3.remove(" size of strList3" + strlist3.size()));
        strlist3.add("smartph");
        System.out.println(" is empty" + strlist3.isEmpty());

        ArrayList<String> students = new ArrayList<>(List.of("studnt1", "strudent2", "student3"));

        String [] studentsArray = new String[students.size()];
        studentsArray = students.toArray(studentsArray);

        ArrayList<Integer> integers = new ArrayList<>(List.of(1,53,55,99,-5,2,333));
        integers.sort(Comparator.naturalOrder()); // sort from low to high
        System.out.println(integers);

        integers.sort(Comparator.reverseOrder()); // from high to low
        for (int i = 0; i < integers.size(); i++)
        System.out.println(integers.get(i));


    }
}
