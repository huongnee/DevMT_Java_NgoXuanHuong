/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex402;

/**
 *
 * @author Administrator
 */
public class Program {
    public static void main(String[] args) {
        NhanVienBanHang nvBanHang = new NhanVienBanHang("HEHE", "Hà Nội", 11200);
        nvBanHang.hienThi();

        System.out.println("==============================================================");

        CongNhan congNhan = new CongNhan("OK", "HN", 870);
        congNhan.hienThi();
    }
}
