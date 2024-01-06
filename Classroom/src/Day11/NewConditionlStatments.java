package Day11;

import java.util.Scanner;

public class NewConditionlStatments {
    public static void main(String[] args) {
//        int number = 5;
//        if (number == 6) {
//            System.out.println("number equals to 5");
//        }
   int someNumber = 20;
   if (someNumber % 2 == 0){
      Scanner scanner = new Scanner(System.in);
     if (someNumber > 10)  {
         System.out.println("big number");
     }
      else if (someNumber > 30){
         System.out.println("super number");
     } else{
         System.out.println("this number is <= 20");

     }
       System.out.println("happy new year");
       System.out.println("happy happy");
   }

    }
}
