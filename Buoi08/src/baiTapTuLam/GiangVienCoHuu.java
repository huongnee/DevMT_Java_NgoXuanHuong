package baiTapTuLam;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien{
    private final int soGioQuyDinh = 40;
    private float luongThoaThuan;

    public GiangVienCoHuu() {}

    public GiangVienCoHuu(String hoTen, String email, String diaChi, String dienThoai, int soGioGiang, float luongThoaThuan) {
        super(hoTen, email, diaChi, dienThoai, soGioGiang);
        this.luongThoaThuan = luongThoaThuan;
    }

    public float getLuongThoaThuan() {
        return luongThoaThuan;
    }

    public void setLuongThoaThuan(float luongThoaThuan) {
        this.luongThoaThuan = luongThoaThuan;
    }

    public int getSoGioQuyDinh() {
        return soGioQuyDinh;
    }

    @Override
    public void inputInformation() {
        Scanner sc = new Scanner(System.in);
        super.inputInformation();
        System.out.println("Input luong thoa thuan : ");
        luongThoaThuan = sc.nextFloat();
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Gio quy dinh : " + soGioQuyDinh);
        System.out.println("Luong thoa thuan : " + luongThoaThuan);
    }

}
