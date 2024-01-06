package Day41.runTime;

import java.util.EmptyStackException;

public class exception {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
       try {
           System.out.println(a/b);
           System.out.printf("%d%n", 3 + 5);
            someMethod();
           System.out.printf("%d%n", 35 + 13);
       }
       catch (ArithmeticException e){
           System.out.println("num cant be divided");
       }catch (Exception ex) {
           System.out.println("Other exception");
       }
    }
    static void someMethod(){
        throw new EmptyStackException();
    }
}
