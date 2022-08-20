package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle{

    public Bike(String vehicleName, String vehicleModelNmae, String vehicleType) {
        super(vehicleName, vehicleModelNmae, vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        return 0;
    }

    @Override
    public String getManufacturerInformation() {
        return null;
    }
}
