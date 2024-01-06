package Day10;

import java.awt.geom.Arc2D;
import java.util.Scanner;

public class OnlyneShoppngDiscount {
    public static void main(String[] args) {
        /* you are building an onlyne shopping car. write a program that takes
        from user the total double purchase amount as input and calculates the final price
                after appllying discounts based on the rules */

        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        if (amount > 500) {
            double discount = amount * 30 / 100;
            System.out.println("final price after 30% is" +(amount - discount));
        }
        else if (amount > 200) {
            double discount = amount * 20 / 100;
            System.out.println("final price after 20% is" + (amount - discount));
        } else if (amount > 100) {
            double discount = amount * 10 / 100;
            System.out.println("final price after 10% is" + (amount - discount));
        } else {
            System.out.println(" no discount");
        }

    }
}

