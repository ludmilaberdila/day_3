import java.lang.reflect.Array;

public class Problem1 {
    public static void main(String[] args){
        System.out.println("hello");
        sunday();

        int num1 = 10;
        int num2 = 20;
        sunday2(num1, num2);

        String n= "firstName";
        String n2 = "lastName";
        System.out.println(fullName(n, n2));

        int day = 12;
        int month = 6;
        int year = 1987;
        System.out.println("==================================");
        Problem2 ludmila = new Problem2(); // p2 it's instance
        ludmila.setAge("12/6/1987");
        ludmila.setFirsLastName("Ludmila", "Berdila");
//        ludmila.fullDetails();
//        ludmila.displayAge();
//        p2.birthday(day, month, year);  // from instance we call method
//        Problem2.birthday(day, month, year); // we call method if we have static

        Problem2 dumitru = new Problem2();
        dumitru.setAge("2/16/1986");
//        dumitru.displayAge();
        dumitru.setFirsLastName("Dumitru", "Drak");
//        dumitru.fullDetails();

        Problem2 [] persons = {ludmila, dumitru};
        for(int i = 0; i < persons.length; i++ ){
            persons[i].fullDetails();
        }
    }

    public static void sunday(){
        System.out.println("call method sunday");
    }

    public static void sunday2(int num1, int num2 ){
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
    }
   public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
   }
}
