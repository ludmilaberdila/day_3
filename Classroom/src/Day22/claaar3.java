package Day22;

public class claaar3 {
    public static void main(String[] args) {
        int number = 100;
   changeNumber(number);
        System.out.println("in the method number= " + number);

    }

    public static void changeNumber(int number){
        System.out.println("in the method number= " + number);
        number = 0;
        System.out.println("in the method number= " + number);
    }

}


