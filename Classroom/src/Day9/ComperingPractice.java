package Day9;

import java.util.Scanner;

public class ComperingPractice {
    public static void main(String[] args) {
        /*boolean boolean1 = 15>20;
        boolean boolean2 = 19*9<=58;
        boolean boolean3 = 11+5<=75;
        boolean boolean4 = 20>40;
        boolean boolean5 = 90<100;
        boolean boolean6 = 87>86;
        boolean boolean7 = 80/4<99;
        boolean boolean8 = "Hello".equals("HELLO");
        boolean boolean9 = "Hello batch4". length() >=4;
        boolean boolean10 = 87*4<=99;  */

      /*  if (5 <= 10) {
            System.out.println("Hello");
        } else {
            System.out.println("Buy-buy");
        }*/
/*if (15+5=20) {
    System.out.println("buy-buy");
} */


/*String word = "cat";
if (word.length() == 20){
    System.out.println("meow meow");
}
  else {
    System.out.println("moo moo");
  }*/

/* create Scaner object, create int number variable and assign it a value
using scaner. if number is less that 0 print: this is less that 0, otherwise print number
is greater than -1 */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println(" number is > than 0");

        }
         else if (number < 0) {
            System.out.println("number is < than 0");

        } else {
            System.out.println("number == 0");

        }













    }
}