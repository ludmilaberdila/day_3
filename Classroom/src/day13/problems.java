package day13;

public class problems {
    public static void main(String[] args) {
        // String word = "batch3";
//        System.out.println(word.toUpperCase().charAt(0));
//        System.out.println(word.toLowerCase().charAt(1));
//        System.out.println(word.toLowerCase().charAt(2));
//        System.out.println(word.toLowerCase().charAt(3));
//        System.out.println(word.toLowerCase().charAt(4));
//        System.out.println(word.toLowerCase().charAt(5));


       // String word = "ludmila";
       // for (int i = 0; i < word.length(); i++) {
         //   System.out.println(word.charAt(i) + " ");}

       // String word = "ludmila";
      //  for (int i = 0; i < word.length(); i++) {
        //    System.out.print(word.charAt(i) + " ");


       // String word = "ludmila"; //back word
      //  for (int i = word.length()-1; i >=0; i--) {
        //    System.out.println(word.charAt(i) + " ");}


 /*   write a program that print mumbers from 1 to 10.
        when its 2th iteration print: "goot night" on the  new line
        when its 3th iteration print: "i'm the best student" on the  new line
        when its 5th iteration print: "hello word" on the  new line */

        for (int i = 1; i <= 10; i++) {
            System.out.println(i); // Print the current number

            if (i == 2) {
                System.out.println("Good night");
            } else if (i == 3) {
                System.out.println("I'm the best student");
            } else if (i == 5) {
                System.out.println("Hello world");
            }
        }
    }
}



