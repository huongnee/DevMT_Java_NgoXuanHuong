package lab09.baiTapTuLam;

import java.util.Scanner;

public class Car extends Vehicle {
    private String color ;

    public Car() {

    }

    public Car(String maker, String model, double price, String color) {
        super(maker, model, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập màu ");
        color = sc.nextLine();
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Màu : " + color);
    }
}
