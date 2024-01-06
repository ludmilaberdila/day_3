package day17;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
//        //int number = random.nextInt(1000);
//        for (int i = 0; i <= 5; i++)
//            System.out.println(random.nextInt(0, 11));


        // see random numbers and sum, homework
//        Random random = new Random();
//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            int randomNumber = random.nextInt(11);
//            System.out.println(randomNumber);
//            sum += randomNumber;
//        }
//        System.out.println("the sum of rundam numberis: " + sum);


        //homework, secret word
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the secret word: ");
//        String secretWord = scanner.nextLine();
//        int attempts = 0;
//        while (true) {
//            String guessWord = scanner.nextLine();
//            attempts++;
//            if (secretWord.equals(guessWord)) {
//                System.out.println("You guessed the secret word in " + attempts + " attempts!");
//                break;
//            } else {
//                System.out.println("Try again you did't guess!");
//            }
//        }


        //// 2nd way
//        Scanner scanner = new Scanner(System.in);
//       System.out.println("enter the secret word: ");
//        String secretWord = scanner.nextLine();
//int attempts = 0;
//        String word = scanner.nextLine();
//       while (!word.equals(secretWord)){
//           System.out.println("try again, you din't guess!");
//           word = scanner.nextLine();
//           attempts++;
//       }
//        System.out.println("you guess the secret word in " + (attempts +1) + " atempts" );
//    }


        ///do while loop, homework
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Enter secret number: ");
//        int secretNumber = scanner.nextInt();
//        int guess = scanner.nextInt();
//        while (secretNumber != guess) {
//            System.out.println("try again");
//            guess = scanner.nextInt();
//        }
//        System.out.println("Congratulatiion, you guess the number " + secretNumber);



     /*   task 1
        Write a program that generates a random secret number between 0 and 10
        and then prompts user to enter a number again and again
        until user writes the secret number.  */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Enter secret number: ");
//       Random random = new Random();
//        int secretNumber = random.nextInt(0, 11);
//        int guess = scanner.nextInt();
//
//        while (secretNumber != guess) {
//            System.out.println("try again");
//            guess = scanner.nextInt();
//        }
//        System.out.println("Congratulatiion, you guess the number " + secretNumber);


      /* 2.  Write a program that asks from user 5 numbers
        and prints the greatest number.
                Input: 99
        Input: 55
        Input: 33
        Input: 25
        Input: 1000
        Output: The greatest number is 1000  */
//        Scanner scanner = new Scanner(System.in);
//        int greatestNumber = Integer.MIN_VALUE;
//        for (int i = 1; i<=5; i++) {
//            System.out.println("enter number:");
//            int number = scanner.nextInt();
//            if (number > greatestNumber) {
//                greatestNumber = number;
//            }
//        }
//        System.out.println("Greatest Number is " + greatestNumber);


     /* 3. Print The smallest number
        Input: 99
        Input: 55
        Input: 33
        Input: 25
        Input: 1000
        Output: The smallest number is 25  */
//        Scanner scanner = new Scanner(System.in);
//        int greatestNumber = Integer.MAX_VALUE;
//        for (int i = 1; i<=5; i++) {
//            System.out.println("enter number:");
//            int number = scanner.nextInt();
//            if (number < greatestNumber) {
//                greatestNumber = number;
//            }
//        }
//        System.out.println("Smollest Number is: " + greatestNumber);



     /* 4 task
        Write a program that generates 10 random numbers between 5 and 50
                * print every random number on a new line.
        Output:
        5, 24, 29,1,19,43,9,1,2,49,
        5 Numbers are greater than 10  */
//        Random random = new Random();
//        for( int i= 1; i<= 10; i++){
//            System.out.println(random.nextInt(0,50));
//        }



     /* 5...   Write a program that generates 10 random numbers between 5 and 50
                * print every random number on a new line.
                * print the number of random nums greater than 10
        Output:
        5, 24, 29,1,19,43,9,1,2,49,
        5 Numbers are greater than 10   */
//        Random random = new Random();
//        int counter = 0;
//        for( int i= 1; i<= 10; i++) {
//            int randomNumber = random.nextInt(5, 51);
//            System.out.println(randomNumber);
//            if (randomNumber > 10) {
//                counter++;
//            }
//        }
//        System.out.println(counter + "numbers are greater than 10");


       /*  6...Write a program that generate 5 random numbers between 1 and 2
      * print every random number on a new line
        * when random number is 1 print head
      * otherwise print tail
        // Output: head,tail,head,tail,tail     */
//           for (int i = 1; i<=5; i++){
//            int randomNumber = random.nextInt(1, 3);
//            if(randomNumber == 1){
//                System.out.println("head");
//            }
//        else {
//                System.out.println("tail");
//            }
//           }


/* ****** Write a program that generate 5 random numbers between 1 and 2
      * print every random number on a new line
        * when random number is 1 print head
      * otherwise print tail
        Output: head,head,head,head,head
        You won a jackpot! */
        int head = 0, tail = 0;
        for (int i = 1; i <= 5; i++){
            int randomNUmber = random.nextInt(1,3);
            if (randomNUmber == 1){
                System.out.println("head");
            }
        else {
                System.out.println("tail");
                tail++;
            }
        }
       if(head == 5 || tail == 5){
           System.out.println("you won a jockpot");
       }

    }
}