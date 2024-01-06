package Day8;

import java.util.Scanner;

public class Tascs {
    public static void main(String[] args) {

       // Scanner scaner = new Scanner(System.in);
        //String word = scaner.nextLine();
        //int length = word.length();
       // System.out.println("the lenght of the String is " + word.length());

        //can we do substring
       // String word = "Hello";
       // System.out.println(word.substring(2).substring(1).toUpperCase().substring(1).isEmpty());

     //2
       // String message = "This is just an exemple text!u";
       // System.out.println(message.charAt(message.length()-1));

        //3 print first lether in llower case
       // System.out.println(message.substring(0,1));
       // System.out.println(message.substring(0,1). toLowerCase());

        // print last letter in uperchase
        //System.out.println(message.substring(29). toUpperCase());

        /*declare a string word take its value from keyboard  Imput: Hello, you need to print word removing
        1st and last letter. output:ell*/

               /* String word = scaner.nextLine();
        System.out.println(word.substring(1,5));
        //hello batch4
        //01234567891011
        System.out.println(word.substring(1,2));
       String word1 = scaner.nextLine();
     String word2 = scaner.nextLine();
        System.out.println(word1.substring(0,2) + word2.substring(word2.length()-2));
       System.out.println(word1.substring(0,3) + word2.substring(word2.length()-3) + word2.substring(word2.length()-3) + word1.substring(0,3) ); */

           //System.out.println(word1.substring(0, leng) + word2.substring(word2.length()-3));

           // System.out.println(word1.substring(0,2) + word2.substring(word2.length()-2));


      //  System.out.print(word.substring(0,2) + word.substring(3));

       String word = "Computer";
        int star = 3;
        int end = 6;
        word = word.toUpperCase(); //->"COMPUTER"
           //     String firstHalf = word.substring(0,start);
               // CONputER (3,6)
        String mid = word.substring(star, end).toLowerCase();
        /*int start = scaner.nextInt();
        int end = scaner.nextInt();
        String firstHalf = word.substring(0, start);
        String mid = word.substring(start,end);
        String secondHalf = word.substring(end);
        System.out.println(firstHalf + mid + secondHalf); */





    }
}
