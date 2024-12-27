package demoExample;

public class Circle extends Shape{
    private float area;
    @Override
    public void calculate(float val) {
        area = getPI()*val*val;
        System.out.println("Diameter of circle is " + area);
    }

}
