package vehicles;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle {
    private double fuelQuantity;
    private double fuelConsumptionPerKm;
    private double tankCapacity;

    public VehicleImpl(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) throws Exception {
        this.setTankCapacity(tankCapacity);
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumptionPerKm);
    }

    public void setTankCapacity(double tankCapacity) throws Exception {
        if (tankCapacity <= 0) {
            throw new Exception("Fuel must be a positive number");
        }
        this.tankCapacity = tankCapacity;
    }

    protected void setFuelConsumption(double fuelConsumptionPerKm) {
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    public double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) throws Exception {
        if (fuelQuantity <= 0) {
            throw new Exception("Fuel must be a positive number");
        }
        if (fuelQuantity > this.tankCapacity) {
            throw new Exception("Cannot fit fuel in tank");
        } else {
            this.fuelQuantity += fuelQuantity;
        }
    }

    @Override
    public String drive(double distance) {
        double fuelNeeded = distance * this.fuelConsumptionPerKm;
        DecimalFormat format = new DecimalFormat("#.##");
        String result = "needs refueling";

        if (this.fuelQuantity >= fuelNeeded) {
            result = String.format("travelled %s km", format.format(distance));
            this.fuelQuantity -= fuelNeeded;
        }

        return result;
    }

    @Override
    public void refuel(double liters) throws Exception {
        this.setFuelQuantity(liters);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
