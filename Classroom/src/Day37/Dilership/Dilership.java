//package Day37.Dilership;
//
//import java.util.ArrayList;
//
//public class Dilership {
//    ArrayList<Vehicle> rentalVehicles = new ArrayList<>();
//    public void add (Vehicle vehicle) {
//        rentalVehicles.add(vehicle);
//        System.out.println(vehicle.make + "was added");
//    }
//    public void rent(String registrationNumber) {
//        for (int i = 0; i < rentalVehicles.size(); i++){
//        Vehicle vehicle = rentalVehicles.get(i);
//        if (vehicle.registrationNumber.equals(registrationNumber)){
//                vehicle.available = false;
//            }
//        }
//    }
//
//    public  void  displayRegistrationCars() {
//        for (Vehicle rentalVehicle : rentalVehicles) {
//            System.out.println("Registration number:" + rentalVehicle.registrationNumber);
//            System.out.println("make" + rentalVehicle.make);
//            System.out.println("available" + rentalVehicle.available);
//        }
//    }
//    public void  rentalVehicles( String rentalVehicle){
//        for (int i = 0; i < rentalVehicles.size(); i++){
//            Vehicle vehicle = rentalVehicles.get(i);
//            if (vehicle.registrationNumber.equals(//registrationNumber)){
//                vehicle.available = true;
//            }
//        }
//    }
//}
//

