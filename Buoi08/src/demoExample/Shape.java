package demoExample;

public abstract class Shape {
    private final float PI = 3.14f;
    public float getPI() {
        return PI;
    }
    //method abstract
    public abstract void calculate(float val);
}
