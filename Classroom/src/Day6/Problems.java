package Day6;

import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + ", have a productive day !"); */



      /* 2. write a program that  takes from user 2 number and print their sum
      input: 5
      input: 10
      output:15


        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1 + number2);  */

        /* 3. write a program that  takes from user 2 number and stores their sum in variable int result.
        result: input:5, input:10, output:15

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 + number2;
        System.out.println(result);  */

        /* 4. write a program that  takes from user 2 number and stores their averege in bouble average
        print the average:  Input : 25, input: 5
        Average of 25 and 5 is 15 */

        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double average = (number1+number2)/2;
        System.out.println("average of " + number1 + " and " + number2 + " is " + average);

      /* 5. write a program that  takes from user 3 number and stores their and stores
      their "product (multiplication) ". print the product
      Input: 3
      input: 9
      input: 10
      result: 3*9*10=270
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int product = number1 * number2 * number3;
        System.out.println(number1 + "*" + number2 + "*" + number3 + "=" + product); */


      /* 6.  write a program that  takes from user 4 double numbers and stores their division result
      in the double result. output: input: 72, input:2, input:6; input:3

        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();
        double result = n1/n2/n3/n4;
        System.out.println(n1 + "/" + n2 + "/" + n3 + "/" + n4 + "=" + result); */


        /* 7. write a program that takes from user number and print this: input: 193, result 1,9,3

        int number = 193;
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int lastDigit = number % 10;
        System.out.println(firstDigit + "," + lastDigit + "," + secondDigit); */

    }
}
