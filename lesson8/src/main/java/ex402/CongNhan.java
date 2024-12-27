/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex402;

/**
 *
 * @author Administrator
 */
class CongNhan extends NhanVien {
    private int soLuongSanPham;

    public CongNhan(String ten, String diaChi, int soLuongSanPham) {
        super(ten, diaChi);
        this.soLuongSanPham = soLuongSanPham;
    }

    @Override
    public double tinhLuong() {
        return soLuongSanPham * 30000;
    }

    @Override
    public void hienThi() {
        System.out.println("Công nhân:");
        System.out.println("Tên: " + ten);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số lượng sản phẩm: " + soLuongSanPham);
        System.out.println("Lương: " + tinhLuong() + " VNĐ");
    }
}
