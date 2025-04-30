public class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 35.0;
    }

    @Override
    public int getMaxSpeed() {
        return 160;
    }
}
