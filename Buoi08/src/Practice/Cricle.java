package Practice;

import java.util.Scanner;

public class Cricle extends Shape{
    float radius;
    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius : ");
        radius = sc.nextFloat();
    }
    @Override
    public void calArea() {
        float area = (float) (Math.PI*radius*radius);
        System.out.println("Area of circle is " + area);
    }
}
