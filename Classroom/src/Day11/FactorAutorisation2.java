package Day11;

import java.util.Scanner;

public class FactorAutorisation2 {
    public static void main(String[] args) {
        String correctEmail = "codewise@gmail.com";
        String correctPassword = "Codwiser!";
        int correctoneTimePasscode = 9532;

        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String Password = scanner.nextLine();
        int oneTimePasscode;


        if (email.equals(correctEmail) && Password.equals(correctPassword)) {
            System.out.println("email and password are correct");
            System.out.println("4 digit passcode sent to your phone");
            oneTimePasscode = scanner.nextInt();
            if (oneTimePasscode == correctoneTimePasscode) {
                System.out.println("you are autorized!");
            } else {
                System.out.println("email and password are not correct");
            }
        } else {
            System.out.println("email and password aren't correct");
        }
    }
}
