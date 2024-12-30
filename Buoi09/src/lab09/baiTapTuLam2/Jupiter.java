package lab09.baiTapTuLam2;

import lab09.baiTapTuLam2.Motor;
import java.util.Scanner;

public class Jupiter extends Motor {
    private int warranty;

    public Jupiter() {
        super();
    }

    public Jupiter(String code, String name, double capacity, int num, int warranty) {
        super(code, name, capacity, num);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thời gian bảo hành: ");
        this.warranty = scanner.nextInt();
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("Thời gian bảo hành: " + this.warranty);
    }
}