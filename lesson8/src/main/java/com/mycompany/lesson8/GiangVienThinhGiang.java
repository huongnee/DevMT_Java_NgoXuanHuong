/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson8;

/**
 *
 * @author Administrator
 */
class GiangVienThinhGiang extends GiangVien {
    private String coQuanLamViec;
    private int luongMoiGio;

public GiangVienThinhGiang(String tenGiangVien, String email, String diaChi, String soDienThoai, String coQuanLamViec, int soGioDayTrongThang, int luongMoiGio) {
    super(tenGiangVien, email, diaChi, soDienThoai, soGioDayTrongThang);
    this.coQuanLamViec = coQuanLamViec;
    this.luongMoiGio = luongMoiGio;
}

public String getCoQuanLamViec() {
    return coQuanLamViec;
}

public void setCoQuanLamViec(String coQuanLamViec) {
    this.coQuanLamViec = coQuanLamViec;
}

public int getLuongMoiGio() {
    return luongMoiGio;
}

public void setLuongMoiGio(int luongMoiGio) {
    this.luongMoiGio = luongMoiGio;
}
@Override
public int tinhTienLuong() {
    return getSoGioDayTrongThang() * luongMoiGio;
}

@Override
public String toString() {
    return super.toString() +
            ", Loai giang vien: Tham gia day thinh giang" +
            ", Co quan lam viec: " + coQuanLamViec +
            ", Luong moi gio: " + luongMoiGio +
            ", Tien luong: " + tinhTienLuong();
}
}

