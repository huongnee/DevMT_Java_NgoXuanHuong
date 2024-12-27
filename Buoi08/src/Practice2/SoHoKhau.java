package Practice2;

import java.util.Scanner;

public class SoHoKhau extends HoKhau{
    private int soNhanKhau;
    private HoKhau[] arrNhanKhau;

    public SoHoKhau() {
    }
    public SoHoKhau(int soNhanKhau) {
        this.soNhanKhau = soNhanKhau;
        arrNhanKhau = new HoKhau[soNhanKhau];
    }

    public SoHoKhau(String ngaySinh, Boolean gioiTinh, String hoTen, String diaChiHienNay, String noiCongTac, int soNhanKhau, HoKhau[] arrNhanKhau) {
        super(ngaySinh, gioiTinh, hoTen, diaChiHienNay, noiCongTac);
        this.soNhanKhau = soNhanKhau;
        this.arrNhanKhau = arrNhanKhau;
    }

    public int getSoNhanKhau() {
        return soNhanKhau;
    }

    public void setSoNhanKhau(int soNhanKhau) {
        this.soNhanKhau = soNhanKhau;
    }

    public HoKhau[] getArrNhanKhau() {
        return arrNhanKhau;
    }

    public void setArrNhanKhau(HoKhau[] arrNhanKhau) {
        this.arrNhanKhau = arrNhanKhau;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arrNhanKhau.length; i++){
            System.out.println("Nhập thông tin cho nhan khau " + (i+1) + "");
            arrNhanKhau[i] = new HoKhau();
            arrNhanKhau[i].NhapTT();
        }
    }
    public void HienThiThongTin(){
        for(int i = 0; i < arrNhanKhau.length; i++){
            System.out.println("Thông tin của nhan khau " + (i+1) + "");
            arrNhanKhau[i].XuatTT();
        }

    }
    public void showNhanKhau()
    {
        for(int i = 0; i < arrNhanKhau.length; i++){
            System.out.println("Nhan khau " + (i+1) + "");
            System.out.println(arrNhanKhau[i].toString());
        }
    }
}
