import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
//        Random random = new Random();
////        // how to generate a number
////        System.out.println(random.nextInt(100));
//
//     for (int i =0; i<= 100; i++){
//            System.out.println(random.nextInt(100));
//        }



        Random random = new Random();
        int sum = 0;
        for(int i = 1; i <= 5; i++){
            int randomNumber = random.nextInt(11);
            System.out.println(randomNumber);
            sum *= randomNumber;
        }
        System.out.println("The sum of random numbers is " + sum);

    }
}
