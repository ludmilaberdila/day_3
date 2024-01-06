package Day22;
import java.util.Arrays;
public class ArrayReflection {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        changeArray(array);
        System.out.println("in the main array = " + Arrays.toString(array));
    }

    public static void changeArray(int[] array) {
        System.out.println("in the main array = " + Arrays.toString(array));
        System.out.println("in the main array = " + Arrays.toString(array));

    }
}