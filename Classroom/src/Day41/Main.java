package Day41;

import java.io.FileReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // FileReader fileReader = new FileReader("news");
        try {

            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("you can't divide number by 0");
        }
    }
}
    //public static HashMap<Character, Integer> distinctLetters(String word){


