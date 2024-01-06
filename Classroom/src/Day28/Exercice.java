package Day28;
import java.util.Scanner;

public class Exercice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter an even number: ");
            number = scanner.nextInt();

            if (number % 2 != 0) {
                System.out.println("That's not an even number. Try again.");
            }
        } while (number % 2 != 0);

        System.out.println("You entered an even number: " + number);

    }
}
    // write a program that asks from user again and again until user enter even number .enter a number or x to stop

