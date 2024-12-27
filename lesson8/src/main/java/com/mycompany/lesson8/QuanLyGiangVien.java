/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson8;

/**
 *
 * @author Administrator
 */
import java.util.Arrays;
import java.util.Scanner;

public class QuanLyGiangVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GiangVien[] danhSachGiangVien = new GiangVien[10];
        int soLuongGiangVien = 0;
        int luongToiThieu = 200000; // Giá tiền mỗi giờ dạy cho giảng viên thỉnh giảng

        while (true) {
            System.out.println("Chon chuc nang: ");
            System.out.println("1. Nhap thong tin giang vien");
            System.out.println("2. Xuat danh sach giang vien");
            System.out.println("3. Xuat danh sach giang vien co huu");
            System.out.println("4. Xuat danh sach giang vien tham gia day thinh giang");
            System.out.println("5. Tinh tong so tien luong cua toan bo giang vien");
            System.out.println("6. Tim loai giang vien co tong luong cao nhat");
            System.out.println("0. Thoat");

            int chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1:
                    System.out.println("Nhap loai giang vien (1: Giang vien co huu, 2: Giang vien tham gia day thinh giang): ");
                    int loai = scanner.nextInt();
                    scanner.nextLine();

                    if (loai == 1) {
                        System.out.println("Nhap ten giang vien: ");
                        String tenGiangVien = scanner.nextLine();
                        System.out.println("Nhap email giang vien: ");
                        String email = scanner.nextLine();
                        System.out.println("Nhap dia chi giang vien: ");
                        String diaChi = scanner.nextLine();
                        System.out.println("Nhap so dien thoai giang vien: ");
                        String soDienThoai = scanner.nextLine();
                        System.out.println("Nhap so gio giang day trong thang: ");
                        int soGioDayTrongThang = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nhap luong thoan thuan: ");
                        int luongThoanThuat = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nhap so gio quy dinh trong thang: ");
                        int soGioQuyDinhTrongThang = scanner.nextInt();
                        scanner.nextLine();

                        GiangVienCoHuu giangVienCoHuu = new GiangVienCoHuu(tenGiangVien, email, diaChi, soDienThoai,
                                soGioDayTrongThang, luongThoanThuat, soGioQuyDinhTrongThang);
                        danhSachGiangVien[soLuongGiangVien] = giangVienCoHuu;
                        soLuongGiangVien++;
                    } else if (loai == 2) {
                        System.out.println("Nhap ten giang vien: ");
                        String tenGiangVien = scanner.nextLine();
                        System.out.println("Nhap email giang vien: ");
                        String email = scanner.nextLine();
                        System.out.println("Nhap dia chi giang vien: ");
                        String diaChi = scanner.nextLine();
                        System.out.println("Nhap so dien thoai giang vien: ");
                        String soDienThoai = scanner.nextLine();
                        System.out.println("Nhap co quan lam viec: ");
                        String coQuanLamViec = scanner.nextLine();
                        System.out.println("Nhap so gio giang day trong thang: ");
                        int soGioDayTrongThang = scanner.nextInt();
                        scanner.nextLine();

                        GiangVienThinhGiang giangVienThinhGiang = new GiangVienThinhGiang(tenGiangVien, email, diaChi,
                                soDienThoai, coQuanLamViec, soGioDayTrongThang, luongToiThieu);
                        danhSachGiangVien[soLuongGiangVien] = giangVienThinhGiang;
                        soLuongGiangVien++;
                    }
                    break;

                case 2:
                    System.out.println("Danh sach giang vien: ");
                    for (int i = 0; i < soLuongGiangVien; i++) {
                        System.out.println(danhSachGiangVien[i].toString());
                    }
                    break;

                case 3:
                    System.out.println("Danh sach giang vien co huu: ");
                    for (int i = 0; i < soLuongGiangVien; i++) {
                        if (danhSachGiangVien[i] instanceof GiangVienCoHuu) {
                            System.out.println(danhSachGiangVien[i].toString());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Danh sach giang vien tham gia day thinh giang: ");
                    for (int i = 0; i < soLuongGiangVien; i++) {
                        if (danhSachGiangVien[i] instanceof GiangVienThinhGiang) {
                            System.out.println(danhSachGiangVien[i].toString());
                        }
                    }
                    break;

                case 5:
                    int tongTienLuong = 0;
                    for (int i = 0; i < soLuongGiangVien; i++) {
                        tongTienLuong += danhSachGiangVien[i].tinhTienLuong();
                    }
                    System.out.println("Tong so tien luong cua toan bo giang vien la: " + tongTienLuong);
                    break;

                case 6:
                    int maxTongLuong = Integer.MIN_VALUE; // Giá trị lương cao nhất
                    GiangVien giangVienCoTongLuongCaoNhat = null; // Giảng viên có tổng lương cao nhất

                    for (int i = 0; i < soLuongGiangVien; i++) {
                        int tongLuong = danhSachGiangVien[i].tinhTienLuong();
                        if (tongLuong > maxTongLuong) {
                            maxTongLuong = tongLuong;
                            giangVienCoTongLuongCaoNhat = danhSachGiangVien[i];
                        }
                    }

                    if (giangVienCoTongLuongCaoNhat instanceof GiangVienCoHuu) {
                        System.out.println("Giang vien co huu co tong luong cao nhat la: " + giangVienCoTongLuongCaoNhat.getTenGiangVien());
                    } else if (giangVienCoTongLuongCaoNhat instanceof GiangVienThinhGiang) {
                        System.out.println("Giang vien tham gia day thinh giang co tong luong cao nhat la: " + giangVienCoTongLuongCaoNhat.getTenGiangVien());
                    }
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Khong co chuc nang nay");
                    break;
            }
        }
    }
}
