package Day28;

import java.util.Scanner;

public class nn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.print("Enter a number or 'x' to stop: ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("x")) {
                System.out.println(" Goodbye");
                break;
            }
        }
    }
}