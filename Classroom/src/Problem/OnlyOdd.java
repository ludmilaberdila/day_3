package Problem;

import java.util.ArrayList;
import java.util.List;

public class OnlyOdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,7,9,19));
                //how can we check in Array of integer we have only odd number
        boolean containsOnlyOddNumbers = true;

        for (int number : list) {
            if (number % 2 == 0) {
                containsOnlyOddNumbers = false;
                break;
            }
        }
            System.out.println(containsOnlyOddNumbers);
        }

    }
