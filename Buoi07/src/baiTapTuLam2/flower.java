package baiTapTuLam2;

import java.util.Scanner;

public class flower {
    private String flowerID;
    private String flowerName;
    private String color;
    /**
     * 1:Hồng đỏ
     * 2:Hồng vàng
     * 3:Hồng trắng
     */
    private int kindOfFlower;

    public flower() {
    }

    public flower(String flowerID, String flowerName, String color, int kindOfFlower) {
        this.flowerID = flowerID;
        this.flowerName = flowerName;
        this.color = color;
        this.kindOfFlower = kindOfFlower;
    }

    public String getFlowerID() {
        return flowerID;
    }

    public void setFlowerID(String flowerID) {
        this.flowerID = flowerID;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKindOfFlower() {
        return kindOfFlower;
    }

    public void setKindOfFlower(int kindOfFlower) {
        this.kindOfFlower = kindOfFlower;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the flower ID: ");
        flowerID = sc.nextLine();
        System.out.println("Enter the flower name: ");
        flowerName = sc.nextLine();
        System.out.println("Enter the color: ");
        color = sc.nextLine();
        System.out.println("Enter the kind of flower: ");
        kindOfFlower = sc.nextInt();
    }
    public void display(){
        System.out.println("Flower ID: " + flowerID);
        System.out.println("Flower Name: " + flowerName);
        System.out.println("Color: " + color);
        System.out.println("Kind of Flower: " + kindOfFlower);
    }
}
