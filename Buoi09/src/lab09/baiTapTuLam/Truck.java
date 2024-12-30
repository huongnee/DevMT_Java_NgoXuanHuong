package lab09.baiTapTuLam;

import java.util.Scanner;

public class Truck extends Vehicle {
    private int truckload;

    public Truck() {
    }

    public Truck(String maker, String model, double price, int truckload) {
        super(maker, model, price);
        this.truckload = truckload;
    }

    public int getTruckload() {
        return truckload;
    }

    public void setTruckload(int truckload) {
        this.truckload = truckload;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("TruckLoad ");
        truckload = sc.nextInt();
        super.input();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Truckload : " + truckload);
    }
}
