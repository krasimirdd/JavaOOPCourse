package vehicles;

public class Car extends VehicleImpl {

    public Car(double fuelQuantity, double fuelConsumptionPerKm, double capacity) throws Exception {
        super(fuelQuantity, fuelConsumptionPerKm, capacity);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumptionPerKm) {
        super.setFuelConsumption(fuelConsumptionPerKm + 0.9);
    }

    @Override
    public String drive(double distance) {
        return "Car " + super.drive(distance);
    }
}
