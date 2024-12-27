package demoExample;

public class FourWheeler extends Vehicle{
    private boolean powerSteer;

    public FourWheeler() {
    }
    public FourWheeler(String vehicleName, String vehicleNo, int wheels, boolean powerSteer) {
        super(vehicleName, vehicleNo, wheels);
        this.powerSteer = powerSteer;
    }
    public void showDetails()
    {
        System.out.println("Vehicle no : "+" "+vehicleNo);
        System.out.println("Vehicle name : "+vehicleName);
        System.out.println("Number of wheels : "+wheels);
        if(powerSteer==true)
        {
            System.out.println("Power steering : true");
        }
        else {
            System.out.println("Power steering : false");
        }
    }

    public static void main(String[] args) {
        FourWheeler f = new FourWheeler("BMW", "123456", 4, true);
        f.showDetails();
        f.accelerate(100);
    }

}
