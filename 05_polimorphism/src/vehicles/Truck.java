package vehicles;

public class Truck extends VehicleImpl {

    public Truck(double fuelQuantity, double fuelConsumptionPerKm, double capacity) throws Exception {
        super(fuelQuantity, fuelConsumptionPerKm,capacity);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumptionPerKm) {
        super.setFuelConsumption(fuelConsumptionPerKm + 1.6);
    }

    @Override
    public void refuel(double liters) throws Exception {
        super.refuel(liters * 0.95);
    }

    @Override
    public String drive(double distance) {
        return "Truck " + super.drive(distance);
    }
}
