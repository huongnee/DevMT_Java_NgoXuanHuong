package Practice;

import java.util.Scanner;

public class Tritangle extends Shape{
    float height;
    float bottom;
    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height : ");
        height = sc.nextFloat();
        System.out.println("Input bottom : ");
        bottom = sc.nextFloat();
    }

    @Override
    public void calArea() {
        float area = (float) (0.5*height*bottom);
        System.out.println("Area of triangle is " + area);
    }
}
