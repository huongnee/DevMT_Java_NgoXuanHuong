package theory;

public class twoWheeler implements IVehicle {
    String id;
    String type;
    public twoWheeler(String id, String type) {
        this.id = id;
        this.type = type;
    }
    @Override
    public void drive() {
        System.out.println("I'm driving"+" "+type);
    }

    @Override
    public void stop() {
        System.out.println( "I'm stopping");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Accelerating at "+speed+"");
    }

    public static void main(String[] args) {
        twoWheeler tw = new twoWheeler("AA-1234567", "Car");
        tw.drive();
        tw.stop();
        tw.accelerate(100);
    }
}
