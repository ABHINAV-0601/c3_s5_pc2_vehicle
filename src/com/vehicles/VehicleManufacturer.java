package com.vehicles;

public abstract class VehicleManufacturer {
    private String vehicleName;
    private String vehicleModelNmae;
    private String vehicleType;

    public VehicleManufacturer(String vehicleName, String vehicleModelNmae, String vehicleType) {
        this.vehicleName = vehicleName;
        this.vehicleModelNmae = vehicleModelNmae;
        this.vehicleType = vehicleType;
    }
    public String getVehicleName() {
        return vehicleName;
    }
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
    public String getVehicleModelNmae() {
        return vehicleModelNmae;
    }
    public void setVehicleModelNmae(String vehicleModelNmae) {
        this.vehicleModelNmae = vehicleModelNmae;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
