package Day10;

import java.util.Scanner;

public class LogialOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(word.contains("o"));
        if(word.contains("o") && word.length()<=6){
            System.out.println("intresting word");
        }
        else if(word.contains("o")&& word.length()>6){
            System.out.println("super intresting word");
        }
        else{
            System.out.println("boring word");
        }
    }
}
