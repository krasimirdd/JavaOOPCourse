package vehicles;

public class Bus extends VehicleImpl {
    private double driveEmptyConsumption;

    public Bus(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) throws Exception {
        super(fuelQuantity, fuelConsumptionPerKm, tankCapacity);
        this.driveEmptyConsumption = fuelConsumptionPerKm;
    }

    @Override
    protected void setFuelConsumption(double fuelConsumptionPerKm) {
        super.setFuelConsumption(fuelConsumptionPerKm + 1.4);
    }

    @Override
    public String drive(double distance) {

        this.setFuelConsumption(driveEmptyConsumption);
        String result = "Bus " + super.drive(distance);
        return result;
    }

    public String driveEmpty(double distance) {

        super.setFuelConsumption(driveEmptyConsumption);
        String result = "Bus " + super.drive(distance);
        if (getFuelQuantity() < 1) {
            result += "\nBus needs refueling";
        }
        return result;
    }
}
