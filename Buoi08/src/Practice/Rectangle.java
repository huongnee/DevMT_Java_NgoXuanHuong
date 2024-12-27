package Practice;

import java.util.Scanner;

public class Rectangle extends Shape{
    float cr,cd;

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài : ");
        cd = sc.nextFloat();
        System.out.println("Nhập chiều rộng : ");
        cr = sc.nextFloat();
    }

    @Override
    public void calArea() {
        float area = cd*cr;
        System.out.println("Area of rectangle is " + area);
    }


}
