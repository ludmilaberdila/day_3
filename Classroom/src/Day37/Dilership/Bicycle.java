package Day37.Dilership;

public class Bicycle extends Vehicle{
    String numGears;

    public Bicycle(String registrationNumber, String make, String model, double rentalRate,double available) {
        super(registrationNumber, make, model, rentalRate, available);
        this.numGears = numGears;
    }
}
