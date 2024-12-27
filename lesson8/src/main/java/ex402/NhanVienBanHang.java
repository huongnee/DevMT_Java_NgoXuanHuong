/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex402;

/**
 *
 * @author Administrator
 */
class NhanVienBanHang extends NhanVien {
    private int soLuongBanDuoc;

    public NhanVienBanHang(String ten, String diaChi, int soLuongBanDuoc) {
        super(ten, diaChi);
        this.soLuongBanDuoc = soLuongBanDuoc;
    }

    @Override
    public double tinhLuong() {
        return soLuongBanDuoc * 50000;
    }

    @Override
    public void hienThi() {
        System.out.println("Nhân viên bán hàng:");
        System.out.println("Tên: " + ten);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số lượng bán được: " + soLuongBanDuoc);
        System.out.println("Lương: " + tinhLuong() + " VNĐ");
    }
}