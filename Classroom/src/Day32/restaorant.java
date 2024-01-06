package Day32;

import java.util.Scanner;

public class restaorant {
    public static void main(String[] args) {
      /*  declare a variable int balance = 30; read from user int day, ,
          if it is Monday tuesday or Wendnesday then you need to subtract from balance 30$
        if it is Thusday then you need to subtract only 25$ and then print balance
          and then print balance
        if it is Saturday or Sunday then subtract only 10$ and print balance  */

        Scanner scanner = new Scanner(System.in);
        int balance = 30;
        int day = scanner.nextInt();
        switch (day ){
            case 1,2,3 -> System.out.println(balance -30);
            case 4 -> System.out.println(balance -25);
            case 5, 6 -> System.out.println(balance -10);
            default -> System.out.println("invalide day");
        }
        System.out.println(balance);
    }
}
