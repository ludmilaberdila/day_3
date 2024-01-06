import java.time.Year;
import java.util.Scanner;

public class Day2 {       // CLASS
    public static void main(String[] args) {  // METHODS
        Day2 d = new Day2();
        d.startProgram();
    }

    public void startProgram(){
        print("******************* Program starts *******************");
        String userName = inputStr("What is your name: ");
        int userIntInput = inputInt("What year did you born ");
        int age = this.calculateAge(userIntInput);
        print("Hi " + userName + " you should be " + age + " now");

        print("--------------------------");

        int nr1 = inputInt("I can add numbers for you,\nenter first number: ");
        int nr2 = inputInt("Now enter second number: ");
        print("sum is: " + this.addNumbers(nr1, nr2));
        print("******************* Program finish *******************");
    }

    private static void print(String text){
        // static makes method of class method
        System.out.println(text);
    }

    private static String inputStr(String userMessage){
        print(userMessage);
        Scanner scanner = scanner();
        return scanner.nextLine();
    }

    private static int inputInt(String userMessage){
        print(userMessage);
        Scanner scanner = scanner();
        return scanner.nextInt();
    }

    private static Scanner scanner(){

        return new Scanner(System.in);
    }

    public int calculateAge(int yearBorn){
        int currentYear = Year.now().getValue();
        return currentYear - yearBorn;
    }

    public void printDay(String text){
        System.out.println(text);
    }

    public int addNumbers(int nr1, int nr2){

        return nr1 + nr2;
    }
}
