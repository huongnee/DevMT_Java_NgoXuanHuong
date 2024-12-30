package lab09.baiTapTuLam;

import java.util.Scanner;

public class Vehicle implements IVehicle {

    private String maker;
    private String model;
    private double price;
    public Vehicle(){}
    public Vehicle(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter make : ");
        maker = sc.nextLine();
        System.out.println("Enter model : ");
        model = sc.nextLine();
        System.out.println("Enter price : ");
        price = sc.nextDouble();
    }

    @Override
    public void display() {
        System.out.println("Vehicle : " + maker + " " + model + " " + price + "");
    }
}
