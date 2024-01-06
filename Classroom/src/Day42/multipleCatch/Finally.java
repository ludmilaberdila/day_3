package Day42.multipleCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a/b);
        }
        catch (Exception ex){
            System.out.println("aritm. exception : / by 0");
        }

    }
}
