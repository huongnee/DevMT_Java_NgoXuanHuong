package baiTapTuLam;

import java.util.Scanner;

public class GiangVien {
    private String hoTen;
    private String email;
    private String diaChi;
    private String dienThoai;
    private int soGioGiang;

    public GiangVien() {}

    public GiangVien(String hoTen, String email, String diaChi, String dienThoai, int soGioGiang) {
        this.hoTen = hoTen;
        this.email = email;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.soGioGiang = soGioGiang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public int getSoGioGiang() {
        return soGioGiang;
    }

    public void setSoGioGiang(int soGioGiang) {
        this.soGioGiang = soGioGiang;
    }

    public void inputInformation(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        hoTen = scanner.nextLine();
        System.out.println("Nhap email : ");
        email = scanner.nextLine();
        System.out.println("Nhap dia chi : ");
        diaChi = scanner.nextLine();
        System.out.println("Nhap dien thoai : ");
        dienThoai = scanner.nextLine();
        System.out.println("So gio giang : ");
        soGioGiang = scanner.nextInt();
    }
    public void showInformation(){
        System.out.println("============== Giang vien =============");
        System.out.println("Ho ten : " + hoTen);
        System.out.println("Email : " + email);
        System.out.println("Dia chi : " + diaChi);
        System.out.println("Dien thoai : " + dienThoai);
        System.out.println("So gio giang : " + soGioGiang);
    }
}
