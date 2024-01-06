import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class propp {
    public static void main(String[] args) {
//        String s="aabbccdef";
//        Set<Character> set=new LinkedHashSet<Character>();
//        for(char c:s.toCharArray())
//        {
//            set.add(Character.valueOf(c));
//        }
//        System.out.println(set);
//    }


//        String str1 = "level";
//        String str2 = "car";
//        System.out.println("Is '" + str1 + "' a palindrome? " + isPalindrome(str1));
//        System.out.println("Is '" + str2 + "' a palindrome? " + isPalindrome(str2));
//    }
//
//    public static boolean isPalindrome(String str) {
//        int left = 0;
//        int right = str.length() - 1;
//
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false; // Not a palindrome
//            }
//            left++;
//            right--;
//        }
//
//        return true; // It's a palindrome
//    }
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(3);
        numbers1.add(5);
        numbers1.add(7);
        numbers1.add(9);
        numbers1.add(10);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(3);
        numbers2.add(5);
        numbers2.add(7);
        numbers2.add(9);
        numbers2.add(11);
        numbers2.add(13);
        numbers2.add(15);

        System.out.println("Does numbers1 contain only odd numbers? " + containsOnlyOdd(numbers1));
        System.out.println("Does numbers2 contain only odd numbers? " + containsOnlyOdd(numbers2));
    }

    public static boolean containsOnlyOdd(ArrayList<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                return false; // Found an even number, not all odd
            }
        }
        return true; // All numbers are odd
    }
}
