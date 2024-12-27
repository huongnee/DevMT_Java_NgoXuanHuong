/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson8;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.Scanner;

class GiangVien {
private String tenGiangVien;
private String email;
private String diaChi;
private String soDienThoai;
private int soGioDayTrongThang;

public GiangVien(String tenGiangVien, String email, String diaChi, String soDienThoai, int soGioDayTrongThang) {
    this.tenGiangVien = tenGiangVien;
    this.email = email;
    this.diaChi = diaChi;
    this.soDienThoai = soDienThoai;
    this.soGioDayTrongThang = soGioDayTrongThang;
}

public String getTenGiangVien() {
    return tenGiangVien;
}

public void setTenGiangVien(String tenGiangVien) {
    this.tenGiangVien = tenGiangVien;
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

public String getSoDienThoai() {
    return soDienThoai;
}

public void setSoDienThoai(String soDienThoai) {
    this.soDienThoai = soDienThoai;
}

public int getSoGioDayTrongThang() {
    return soGioDayTrongThang;
}

public void setSoGioDayTrongThang(int soGioDayTrongThang) {
    this.soGioDayTrongThang = soGioDayTrongThang;
}

public int tinhTienLuong() {
    return 0;
}

@Override
public String toString() {
    return "Ten giang vien: " + tenGiangVien +
            ", Email: " + email +
            ", Dia chi: " + diaChi +
            ", So dien thoai: " + soDienThoai +
            ", So gio day trong thang: " + soGioDayTrongThang;
}
}