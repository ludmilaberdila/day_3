package day23;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] array = {5, 33, 3, 12, 8, 20};
   modifyArray(array);
    }
    public static void modifyArray(int[] array) {
        // Modify the elements of the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                array[i] = 0; // Assign 0 to elements less than 10
            }
        }
        // Print the modified array
        System.out.print(Arrays.toString(array));
    }
}