package lab09.baiTapTuLam2;

import java.util.Scanner;

public class Motor implements IMotor {
    protected String code;
    protected String name;
    protected double capacity;
    protected int num;

    public Motor() {}

    public Motor(String code, String name, double capacity, int num) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.num = num;
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã xe: ");
        this.code = scanner.nextLine();
        System.out.print("Nhập tên loại xe: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập dung tích xi lanh: ");
        this.capacity = scanner.nextDouble();
        System.out.print("Nhập kiểu truyền lực (số): ");
        this.num = scanner.nextInt();
    }

    @Override
    public void displayInfor() {
        System.out.println("Mã xe: " + this.code);
        System.out.println("Tên loại xe: " + this.name);
        System.out.println("Dung tích xi lanh: " + this.capacity);
        System.out.println("Kiểu truyền lực: " + this.num);
    }

    @Override
    public void changeInfor() {
        inputInfor();
    }
}