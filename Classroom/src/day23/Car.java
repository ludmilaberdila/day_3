package day23;

public class Car {
     String brand;
     String color;
     int price;

     public static void main(String[] args) {

         Car car1 = new Car();
         car1.brand = "bmw";
         car1.color = "blue";
         car1.price = 50000;

         Car car2 = new Car();
         car2.brand = "mercedes";
         car2.color = "back";
         car2.price = 90000;


         System.out.println("car 1 detailes");
         System.out.println(car1.brand);
         System.out.println(car1.color);
         System.out.println(car1.price);

         System.out.println("car 2 detailes");
         System.out.println(car2.brand);
         System.out.println(car2.color);
         System.out.println(car2.price);
     }
 }


