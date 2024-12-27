/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson8;

/**
 *
 * @author Administrator
 */
class GiangVienCoHuu extends GiangVien {
    private int luongThoanThuat;
private int soGioQuyDinhTrongThang;

public GiangVienCoHuu(String tenGiangVien, String email, String diaChi, String soDienThoai, int soGioDayTrongThang, int luongThoanThuat, int soGioQuyDinhTrongThang) {
    super(tenGiangVien, email, diaChi, soDienThoai, soGioDayTrongThang);
    this.luongThoanThuat = luongThoanThuat;
    this.soGioQuyDinhTrongThang = soGioQuyDinhTrongThang;
}

public int getLuongThoanThuat() {
    return luongThoanThuat;
}

public void setLuongThoanThuat(int luongThoanThuat) {
    this.luongThoanThuat = luongThoanThuat;
}

public int getSoGioQuyDinhTrongThang() {
    return soGioQuyDinhTrongThang;
}

public void setSoGioQuyDinhTrongThang(int soGioQuyDinhTrongThang) {
    this.soGioQuyDinhTrongThang = soGioQuyDinhTrongThang;
}

@Override
public int tinhTienLuong() {
    if (getSoGioDayTrongThang() <= soGioQuyDinhTrongThang) {
        return getSoGioDayTrongThang() * luongThoanThuat;
    } else {
        return soGioQuyDinhTrongThang * luongThoanThuat + (getSoGioDayTrongThang() - soGioQuyDinhTrongThang) * 2 * luongThoanThuat;
    }
}

@Override
public String toString() {
    return super.toString() +
            ", Loai giang vien: Co huu" +
            ", Luong thoan thuat: " + luongThoanThuat +
            ", So gio quy dinh trong thang: " + soGioQuyDinhTrongThang +
            ", Tien luong: " + tinhTienLuong();
}
}
