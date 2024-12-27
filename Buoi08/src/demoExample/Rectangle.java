package demoExample;

public class Rectangle extends Shape{
    protected float s,cr;
    @Override
    public void calculate(float val) {
        s = val * cr;
        System.out.println("Area of rectangle is " + s);
    }
}
