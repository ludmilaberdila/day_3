package Day16;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
//        System.out.println(Character.isDigit('3'));
//        System.out.println(Character.isDigit('%'));
//        System.out.println(Character.isDigit('a'));
//        System.out.println(Character.isLetter('9'));
//        System.out.println(Character.isLetter('%'));
//        System.out.println(Character.isLetter('p'));
//        System.out.println(Character.isLetterOrDigit('1'));
//        System.out.println(Character.isLetterOrDigit('9'));
//        System.out.println(Character.isLetterOrDigit('&')); // will be fals becouse is not a number and not a letter


        //convert int to string
//        String str = "123";
//        int number = Integer.parseInt()


        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        while (number % 2 != 1){
//            System.out.println("hello word");
//        //update expression or increment or decrement
//            number%=2;
//        }
//        System.out.println("good job");


        // tasc.2
//        String word = scanner.nextLine();
//        int j = 0;
//
//        while (j < word.length()) {
//            System.out.println(word.charAt(j)); /// we will print avery letter from word
//            j++;


//            String word =  scanner.nextLine();
//            int j = 0;
//
//            while (j < word.length()){
//                System.out.println(word.charAt(5)); /// print letter 5 from word
//                j++;


//            String word = scanner.nextLine();
//            int j = 0;
//
//            while (j < word.length()) {
//                System.out.println(word.charAt(j) + " , " + (j + 5) + " , " + Character.isLetterOrDigit(word.charAt(j)));
//                j++;

        // ForLoop
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }


        // while loop
//        int j = 1;
//        while (j<=10){
//            System.out.println(j);
//        j++;
//        }

        //do while loop
//    int j = 1;
//        do{
//            System.out.println("mom");
//            j++;
//        }while (j <= 10);


//do while loop
//        int amount = 1100;
//        int a = 0;
//
//        do {
//            System.out.print("Enter the amount of money for purchase ");//+ (a + 1) + ": $");
//            int money = scanner.nextInt();
//
//            if (money >= amount) {
//                System.out.println("You bought a new iPhone.");
//            } else {
//                System.out.println("You need at least $" + amount + " to buy an iPhone.");
//            }
//
//            a++;
//        } while (a < 5);


        //  while loop
//        int i = 1;
//        while (i <= 5) {
//            int money = scanner.nextInt();
//            if (money <= 1100) {
//                System.out.println(" you bougth a new iphone");
//            }
//            else{
//                System.out.println("you can't buy a new iphone");
//            }
//        i++;
//        }


        String word = scanner.nextLine();
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isDigit(ch)) {
                counter1++;
            }
            if (Character.isLetter(ch)) {
                counter2++;
            }
        }
            System.out.println("i found " + counter1 + " letters");
            System.out.println(" i found" + counter2 + "number");
        }
    }

