//package Day10;
//
//public class class10 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        String n1 = scanner.nextLine();
////        String n2 = scanner.nextLine();
////
////        if(n1 == n2){
////            System.out.println("You guessed the secret code");
////        }
////        else{
////            System.out.println("Wrong");
////        }
//
//        // Input: 15
//        // Input: 20
//        // Output: Wrong
//
//        // Input: 20
//        // Input: 20
//        // Output: You guessed the secret code!
//
////        System.out.println(true && true); // true
////        System.out.println(true && false); // false
////        System.out.println(false && true); // false
////        System.out.println(false && false); // false
////
////        System.out.println(5 < 10 && 20 > 10); // true
////        System.out.println(10 < 20 && 20 < 10); // false
////        System.out.println(5 % 2 == 1 && 10 + 2 == 11); // false
////        System.out.println(6 % 2 == 1 && 5 < 3); // false
////
////        System.out.println(5 + 5 > 10 && 5 % 2 == 1 && 3 == 3 && 2 > 5); // false
//
//        System.out.println(5 > 10 || 5 > 2); // true
//        System.out.println("hi".length()>1 || 2 > 0 || false); // true
//    }
//
//
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int firstDigit = number / 10;
//        int secondDigit = number % 10;
//        if(secondDigit % 2 == 0 && firstDigit % 2 == 0){
//            System.out.println("DOUBLE EVEN");
//            System.out.println("FIRST DIGIT = " + firstDigit);
//            System.out.println("SECOND DIGIT = " + secondDigit);
//        }
//        else{
//            System.out.println("Regular number");
//        }
//
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
//        if(word.contains("o") && word.length() <= 6){
//            System.out.println("Interesting word");
//        }
//        else if(word.contains("o") && word.length()>6){
//            System.out.println("Super Interesting word");
//        }
//        else{
//            System.out.println("Boring word");
//        }
//
//
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        double amount = scanner.nextDouble();
//        if(amount > 500){
//            double discount =  amount * 30 / 100;
//            System.out.println("Final price after 30% is " + (amount - discount));
//        }
//        else if(amount > 200){
//            double discount =  amount * 20 / 100;
//            System.out.println("Final price after 20% is " + (amount - discount));
//        }
//        else if(amount > 100){
//            double discount =  amount * 10 / 100;
//            System.out.println("Final price after 10% is " + (amount - discount));
//        }
//        else{
//            System.out.println("No discount");
//        }
//
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        boolean talking = scanner.nextBoolean();
//        int hours = scanner.nextInt();
//        if(!talking){
//            System.out.println("GOOD PARROT");
//        }
//        else if(hours < 7 || hours > 20){
//            System.out.println("BAD PARROT");
//        }
//        else{
//            System.out.println("GOOD PARROT");
//        }
//
//
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        double temperature = scanner.nextDouble();
//        if(temperature <= 32){
//            System.out.println("Wear a heavy coat");
//        }
//        else if(temperature > 32 && temperature < 50){
//            System.out.println("Wear a light jacket");
//        }
//        else{
//            System.out.println("Wear a sweater");
//        }
//    }
//
