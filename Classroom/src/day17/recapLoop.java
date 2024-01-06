package day17;

public class recapLoop {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("hello world");
//            if (i == 7) {
//                //  break;
//                continue;
//            }
//        }
//        System.out.println("hi");

        //skip avery 4 student
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                continue;
            }
                System.out.println(i + "student got apple");
        }
    }
}