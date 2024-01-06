import java.util.Scanner;

public class recap {
    public static void main(String[] args) {
//         for (int i = 1; i <=35; i++) {
//         if(i==29) {
//
//             break;
//         }
//         System.out.println(i + "Correct");}


        //  Scanner scanner = new Scanner(System.in);
//        int sum = 1;
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("Enter number #" + i + ": ");
//            int number = scanner.nextInt();
//            sum *= number;
//        }
//        System.out.println("The sum of the 10 numbers is: " + sum); }


//    int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//        System.out.print("Enter number #" + i + ": ");
//        int number = scanner.nextInt();
//        sum += number;
//    }
//        System.out.println("The sum of the 10 numbers is: " + sum); }


        // write the progrm that take from user 5  number and print a sum, if the number is lees than 10 dont count
//    int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//        System.out.print("Enter number #" + i + ": ");
//        int number = scanner.nextInt();
//        sum -= number;
//    }
//        System.out.println("The sum of the 10 numbers is: " + sum); }

//    Scanner scanner = new Scanner(System.in);
//    int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//        System.out.print("Enter number #" + i + ": ");
//        int number = scanner.nextInt();
//
//        if (number >= 10) {
//            sum += number;
//        }
//    }
//        System.out.println("The sum is: " + sum);}


        // write the progrm that take from user 5  number and print a sum of even numbers
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("Enter number #" + i + ": ");
//            int number = scanner.nextInt();
//
//            if (number % 2 == 0) { // Check if the number is even
//                sum += number; // Add the even number to the sum
//            }
//        }
//
//        System.out.println("The sum of even numbers is: " + sum);
//    }


//        Scanner scanner = new Scanner(System.in);
//        int sumEven = 0;
//        sumOdd = 0;
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("Enter number #" + i + ": ");
//            int number = scanner.nextInt();
//
//            if (number % 2 == 0) { // Check if the number is even
//                sumEven += number; // Add the even number to the sum
//            }
//
//            if (number % 2 != 0) {
//                sumOdd += number;
//            }
//        }
//        System.out.println("the sum of even number is : " + sumEven);
//        System.out.println("the sum of even number is : " + sumOdd);



        //  write the program that take from user 10  number and print a  even numbers and odd numbers
//        Scanner scanner = new Scanner(System.in);
//      int countEven = 0, countOdd = 0;
//        for (int i = 0; i <=10; i++) {
//            int number = scanner.nextInt();
//
//            if (number % 2 == 0) {
//                countEven++;
//            }
//            else {
//                countOdd++;
//            }
//        }
//        System.out.println("number of even is :" + countEven);
//
//        System.out.println("number of odds is : " + countOdd);}


        // write a program in java to write a word reverse order
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a word: ");
//        String word = scanner.nextLine();
//        for (int i = word.length() - 1; i >= 0; i--) {
//            System.out.print(word.charAt(i) + " ");}



        /* write a program that takea from user a String word.
        prit the number of letters " a " repeated in the sentence word. */
//        Scanner scanner = new Scanner(System.in);
//        int countA = 0;
//        String word = scanner.nextLine();
//        int i;
//        for (i = 0; i < word.length(); i++) ;
//        if (word.charAt(i) == 'b') {
//            countA++;
//        }
//        System.out.println(countA);}


   /* write a program thet takes from user 7 times int amountSpent,
      every dollar spent is 2 dollar.
      print the total points earned in 7 days.  */
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 7; i++) {
            int spentMoney = scanner.nextInt();
            sum += spentMoney;
        }
        System.out.println("the total amount of point is " + sum);
    }
}