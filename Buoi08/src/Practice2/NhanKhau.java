package Practice2;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;
import java.util.Scanner;

public class NhanKhau {
    private String hoTen;
    private String ngaySinh;
    private Boolean gioiTinh;



    public NhanKhau() {
    }

    public NhanKhau(String ngaySinh, Boolean gioiTinh, String hoTen) {
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh : ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap gioi tinh : ");
        gioiTinh = sc.nextBoolean();
    }
    public void XuatTT(){
        System.out.println("Họ và tên "+hoTen);
        System.out.println("Ngày sinh "+ngaySinh);
        System.out.println("Gioi tính "+gioiTinh);
    }

    @Override
    public String toString() {
        return "NhanKhau{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh=" + gioiTinh +
                '}';
    }
}
