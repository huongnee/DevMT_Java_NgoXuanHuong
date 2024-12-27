package Practice2;

import java.util.Scanner;

public class QuanLyHoKhau {
    private SoHoKhau[] arrSoHoKhau;
    public int showMenu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Khai báo sổ hộ khẩu");
        System.out.println("2.Danh sách so hộ khẩu ");
        System.out.println("3.Tìm người ");
        System.out.println("Vui lòng nhập từ 1-3");

        return sc.nextInt();
    }
    public void khaiBaoSoHoKhau()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Khai báo sổ hộ khẩu ");
        System.out.println("Nhập số hộ cần khai báo ");
        arrSoHoKhau = new SoHoKhau[sc.nextInt()];
        for(int i = 0; i < arrSoHoKhau.length; i++){
            System.out.println("Nhập số nhân khẩu bộ thứ " + (i+1) + "này");
            Scanner sc1 = new Scanner(System.in);
            arrSoHoKhau[i] = new SoHoKhau(sc1.nextInt());
            arrSoHoKhau[i].nhapThongTin();
        }
        System.out.println("Cảm ơn");
    }
    public void danhSachSoHoKhau(){
        for(int i = 0; i < arrSoHoKhau.length; i++){
            System.out.println("Danh sách sổ hộ khẩu "+i);
            arrSoHoKhau[i].HienThiThongTin();
        }
    }
    public void timKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên người cần tìm ");
        String tenNhanKhau = sc.nextLine();
        for(int i = 0; i < arrSoHoKhau.length; i++){
            for(int j = 0; j < arrSoHoKhau[i].getArrNhanKhau().length; j++){
                if(arrSoHoKhau[i].getArrNhanKhau()[j].getHoTen().equals(tenNhanKhau))
                {
                    arrSoHoKhau[i].getArrNhanKhau()[j].XuatTT();
                }
            }
        }
    }
    public static void main(String[] args) {
        int chonLua = 0;
        QuanLyHoKhau quanLyHoKhau = new QuanLyHoKhau();
        do {
            chonLua = quanLyHoKhau.showMenu();
            switch (chonLua)
            {
                case 1:
                    quanLyHoKhau.khaiBaoSoHoKhau();
                    break;
                case 2:
                    quanLyHoKhau.danhSachSoHoKhau();
                    break;
                case 3:
                    quanLyHoKhau.timKiem();
                    break;
            }

        } while (chonLua > 0 && chonLua < 4);;
        System.out.println("End !!!");
    }
}
