package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle{

    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
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
