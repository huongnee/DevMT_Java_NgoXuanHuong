package demoExample;

public class Vehicle {
    protected String vehicleName,vehicleNo;
    protected int wheels;

    public Vehicle() {
    }

    public Vehicle(String vehicleName, String vehicleNo, int wheels) {
        this.vehicleName = vehicleName;
        this.vehicleNo = vehicleNo;
        this.wheels = wheels;
    }


    public void accelerate(int speed) {
        System.out.println("Accelerating at " + speed + " km/h");
    }
}
