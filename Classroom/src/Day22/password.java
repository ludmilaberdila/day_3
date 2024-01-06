package Day22;

///1. write a method that takes as a parameter a String password and check following: its length
// must be a least 10, and it must contain @. if it meets requirements then print true otherwise print false
/*2 write a method that takes as a parameters an array of integers and print the sum fo number you count only until 13 */
public class password {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 10, 13, 3, 15};
        int sum = calculateSumUntil13(numbers);
        System.out.println("Sum until 13: " + sum);
    }

    public static int calculateSumUntil13(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num == 13) {
                break; // Exit the loop if the number is 13
            }
            sum += num;
        }
        return sum;
    }
}
