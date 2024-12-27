/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex402;

/**
 *
 * @author Administrator
 */
public abstract class NhanVien {
    protected String ten;
    protected String diaChi;

    public NhanVien(String ten, String diaChi) {
        this.ten = ten;
        this.diaChi = diaChi;
    }

    public abstract double tinhLuong();

    public abstract void hienThi();
}
