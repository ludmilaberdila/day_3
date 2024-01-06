package Day37.Dilership;

public class Car extends Vehicle{
    int numSit;

    public Car(String registrationNumber, String make, String model, double rentalRate,double available ){
        super(registrationNumber,  make,  model,  rentalRate, available);
        this.numSit = numSit;
    }
}
