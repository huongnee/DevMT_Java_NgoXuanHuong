package Practice2;

import java.util.Scanner;

public class HoKhau extends NhanKhau{
    private String diaChiHienNay;
    private String noiCongTac;

    public HoKhau() {
    }

    public HoKhau(String ngaySinh, Boolean gioiTinh, String hoTen, String diaChiHienNay, String noiCongTac) {
        super(ngaySinh, gioiTinh, hoTen);
        this.diaChiHienNay = diaChiHienNay;
        this.noiCongTac = noiCongTac;
    }

    public String getDiaChiHienNay() {
        return diaChiHienNay;
    }

    public void setDiaChiHienNay(String diaChiHienNay) {
        this.diaChiHienNay = diaChiHienNay;
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

    @Override
    public void NhapTT() {
        Scanner sc = new Scanner(System.in);

        super.NhapTT();
        System.out.println("Input dia chi hien nay : ");
        diaChiHienNay = sc.nextLine();
        System.out.println("Input noi cong tac : ");
        noiCongTac = sc.nextLine();
    }
    @Override
    public void XuatTT() {
        super.XuatTT();
        System.out.println( "Dia chi hien nay : " + diaChiHienNay );
        System.out.println( "Noi cong tac : " + noiCongTac );
    }
    @Override
    public String toString() {
        return super.toString() + "HoKhau{" + "diaChiHienNay=" + diaChiHienNay + ", noiCongTac=" + noiCongTac + '}';
    }
}
