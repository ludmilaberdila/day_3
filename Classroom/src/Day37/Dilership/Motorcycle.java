package Day37.Dilership;

public class Motorcycle extends Vehicle{
    String engineTipe;
    public Motorcycle(String registrationNumber, String make, String model, double rentalRate,double available) {
        super(registrationNumber, make, model, rentalRate, available);
        this.engineTipe = engineTipe;
    }
}
