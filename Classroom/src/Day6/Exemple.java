package Day6;

import java.util.Scanner;

public class Exemple {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");
        //string inpput
        String name = myObj.nextLine();

        //numerical imput
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        //output input by used
        System.out.println("name:"+ name);
        System.out.println("age:" + age);
        System.out.println("salary:" + salary);

    }
}
