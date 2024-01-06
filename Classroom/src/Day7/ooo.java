package Day7;

import java.util.Scanner;

public class ooo {
    public static void main(String[] args) {
        String message = "Hello everyon, Let's do Java String exercises";
       System.out.println(message.charAt(10));
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.length());
        message = message.toUpperCase();
        System.out.println(message);
        System.out.println(message.replace(" ", " ??? "));
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        System.out.println(result.contains("@"));
      //  System.out.println(message.endsWith("es"));
        //Scanner scanner = new Scanner(System.in);
       // String str1 = scanner.nextLine();
       //String str2 = scanner.nextLine();
      //  System.out.println(str1.contains(str2));
      //  System.out.println(str1.equalsIgnoreCase()str2);

        /*String world = scanner.nextLine();
        String old = scanner.nextLine();
        String newWord = scanner.nextLine();
        System.out.println(newWord.replace(old, newWord)); */







    }
}
