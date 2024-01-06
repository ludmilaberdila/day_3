package DAy5;

public class Execises {
    public static void main(String[] args) {
//        int p=9;
//        System.out.println("the valuie of p is " +p);
//        System.out.println("the square of p is "+ p*p);
//
//        int number1 = 15;
//        System.out.println(number1*10);


        int x = 13363;
        ///13363 % 2 == 1 mean is odd
        System.out.println(x%2==0);
        System.out.println(x%2==1);
        System.out.println(x%12==0); //
        System.out.println(x%29==0); //to check if visible and it is not
        System.out.println(x%29==1);

        int batch4 = 123;
        int firstDigit = batch4/100;
        int secondDigit=batch4 / 10;
        int lastDigit=batch4 / 10 % 10;
        System.out.println(firstDigit + "," + secondDigit + "," + lastDigit);

        /*int year =2023;
        System.out.println(year%10); */




    }
}

