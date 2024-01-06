import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        for( int i = 1; i <= 100; i++){
//            System.out.println(i);}


        //while loop
//        int j = 1;
//        while (j<=10){
//            System.out.println("hello");
//        j++;
//        }


//        String str = "random";
//        String result = "";
//        for(int i = str.length()-1; i>=0; i--){
//            System.out.println(str.charAt(i));
//            result += str.charAt(i);
//        }
//        System.out.println(result);
//        int i = str.length()-1;
//        i--;
//    }
//     System.out.println(result);}

//        int k = 1;
//        while (k <= 10) {
//            System.out.println("good morning everyone");
//            k++;}


//        //initialization
//        int number = scanner.nextInt();
//    //condition
//        while (number !=10){
//        System.out.println("enter number 10");
//        //update expression or increment or decrement
//        number = scanner.nextInt();}


//        int number = scanner.nextInt();
//        while (number % 2 == 0) {
//            System.out.println("even number");
//            number = scanner.nextInt();
//        }
//        System.out.println("good job");}


        String word = scanner.nextLine();
        int j = 0;
        while (j < word.length()) {
            System.out.println(word.charAt(j));
                   System.out.println(Character.isDigit(word.charAt(j)));
            System.out.println();
            j++;
        }

    }
    }