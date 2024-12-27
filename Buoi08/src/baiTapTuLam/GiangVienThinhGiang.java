package baiTapTuLam;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien{
    private String coQuanLamViec;

    public GiangVienThinhGiang (){}

    public GiangVienThinhGiang(String hoTen, String email, String diaChi, String dienThoai, int soGioGiang, String coQuanLamViec) {
        super(hoTen, email, diaChi, dienThoai, soGioGiang);
        this.coQuanLamViec = coQuanLamViec;
    }

    public String getCoQuanLamViec() {
        return coQuanLamViec;
    }

    public void setCoQuanLamViec(String coQuanLamViec) {
        this.coQuanLamViec = coQuanLamViec;
    }

    @Override
    public void inputInformation() {
        Scanner sc = new Scanner(System.in);
        super.inputInformation();
        System.out.println("Input co quan lam viec : ");
        coQuanLamViec = sc.nextLine();
    }
    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Co quan lam viec : " + coQuanLamViec);
    }


}
