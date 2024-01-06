package Day6;

import java.util.Scanner;

public class ScanerPractice {
    public static void main(String[] args) {
        /*String name1;
        String name2;
        Scanner scanner =  new Scanner(System.in);
        name1 = scanner.nextLine();
        name2 = scanner.nextLine();
        System.out.print( name1 );
        System.out.println( name2 ); */

        Scanner liuda = new Scanner(System.in);
        String firstName, secondName;
        System.out.println("What is your fist name ?");
        firstName = liuda.nextLine();
        System.out.println("What is your second name ?");
        secondName = liuda.nextLine();
        System.out.println("Welcome to my course, " + firstName + " " + secondName + "!");
    }
}
