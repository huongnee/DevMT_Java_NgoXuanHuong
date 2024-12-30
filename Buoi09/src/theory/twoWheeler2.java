package theory;

public class twoWheeler2 implements IVehicle , IManufacturer{
    String id;
    String model;
    @Override
    public void drive() {
        System.out.println("Two wheeler is driving");
    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Accelerating at "+speed+" km/h");
    }

    @Override
    public void addContact(String detail) {
        System.out.println("My contact detail is: "+detail+"");
    }

    @Override
    public void callManufacturer(String phone) {
        System.out.println("Calling manufacturer: "+phone+" ");
    }

    @Override
    public void makePayment(float amount) {
        System.out.println("I've paid: "+amount+"");
    }

    public static void main(String[] args) {
        twoWheeler2 tw = new twoWheeler2();
        tw.drive();
        tw.stop();
        tw.accelerate(100);
        tw.addContact("123456789");
        tw.callManufacturer("0123456789");
        tw.makePayment(1000000);
    }
}
