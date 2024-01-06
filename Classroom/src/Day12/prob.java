//package Day12;
//
//import java.util.Scanner;
//
//public class prob {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        String word = scanner.nextLine();
////        int n = scanner.nextInt();
////        System.out.println(word.substring(0,n) + word.substring(n+1));
////
////
////        Scanner scanner = new Scanner(System.in);
////        String word = "computer";
////        int n = 9;
////        if(n>=word.length())
////
////        System.out.println("invalid number");
////String word = scanner.nextLine();
////boolean result = word.substring(0,2).equals(word.substring(word.length()-2));
////        System.out.println(result);
////        System.out.println(word.substring(0.word.length()-3));
//
//
//        //7.
//        // Create a Scanner object to get user input
//
//        // Prompt the user to enter a string
////        System.out.print("Enter a string: ");
////        String inputString = scanner.nextLine();
////
////        // Close the scanner to prevent resource leak
////        scanner.close();
////
////        // Check if the string has at least one character
////        if (inputString.length() < 1) {
////            System.out.println("The string is empty.");
////        } else {
////            // Remove 'x' and 's' from the beginning and end of the string
////            String resultString = removeXAndS(inputString);
////
////            // Print the modified string
////            System.out.println("Modified string: " + resultString);
////        }
////    }
////
////    public static String removeXAndS(String str) {
////        // Check if the first character is 'x'
////        if (str.charAt(0) == 'x') {
////            str = str.substring(1); // Remove the first 'x'
////        }
////
////        // Check if the last character is 'x'
////        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
////            str = str.substring(0, str.length() - 1); // Remove the last 'x'
////        }
////
////        // Remove 's' from the string
////        str = str.replace("s", "");
////
////        return str;
//
//
//        // Scanner scanner = new Scanner(System.in);
////        System.out.println("Please enter first number : ");
////        int number1 = scanner.nextInt();
////        System.out.println("Please enter your second number : ");
////        int number2 = scanner.nextInt();
////        //scanner.next();
////        System.out.println("Sum of two integers : " + number1 + " + " + number2 + " = " + (number1 + number2));
////        System.out.println("Difference of two integers : " + number1 + " - " + number2 + " = " + (number1 - number2));
////        System.out.println("Product of two integers : " + number1 + " * " + number2 + " = " + (number1 * number2));
////        System.out.println("Average of two integers : " + " = " + (number1 + number2) / 2.0);
//
//        System.out.print("Enter the first number: ");
//        double num1 = scanner.nextDouble();
//
//        // Prompt the user to enter the second number
//        System.out.print("Enter the second number: ");
//        double num2 = scanner.nextDouble();
//        char operator = scanner.next().charAt(0);
//        double result;
//        System.out.print("Choose one of these math operators: +, -, *, %: ");
//        if (operator == '+') {
//            result = num1 + num2;
//        } else if (operator == '-') {
//            result = num1 - num2;
//        } else if (operator == '*') {
//            result = num1 * num2;
//        } else if (operator == '%') {
//            if (num2 != 0) {
//                result = num1 % num2;
//            } else {
//                System.out.println("Error: Division by zero.");
//                return;
//            }
//
//
//        }
//