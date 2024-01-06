package Problem;

public class Fibonacci {
    public static void main(String[] args) {
        int count = 10;
    int a = 1;
    int b = 1;
    int c = a + b;

        for(int i = 1; i <= count; i++){
            System.out.println(a + " ");

            a = b;
            b = c;
            c = a + b;

        }
    }
}
