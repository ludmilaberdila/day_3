package Day9;

import java.util.Scanner;

public class ApplicationCheackPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      /*  String password = scanner.nextLine();
        if (password.length() == 5) {
            System.out.println("password level 1");
        }
        if (password.length() > 5) {
            System.out.println("password level 2 ");
        }

        if (password.length() < 5) {
            System.out.println("password level 3");
        }
   */

        // Prompt the user to enter their current balance
        System.out.print("Enter your current balance: $");
        int balance = scanner.nextInt();
        if (balance >= 15000) {
            System.out.println("car b is bouth");
            System.out.println("You can buy Car B.");
        } else if (balance >= 6000) {
            System.out.println("You can buy Car A.");
        } else if (balance >= 3000) {
            System.out.println("You can buy Car C.");
        } else {
            System.out.println("You cannot afford any of the cars.");
        }


    }



}
