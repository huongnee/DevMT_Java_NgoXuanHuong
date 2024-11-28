import java.util.Scanner;

public class BaiThucHanh1 {
    String name,address;
    int soLanThi;
    float diemJava;
    double lePhiThi;
    char gioiTinh;
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn : ");
        name = sc.nextLine();
        System.out.println("Nhập địa chỉ của bạn : ");
        address = sc.nextLine();
        System.out.println("Nhập số lần thi : ");
        soLanThi = sc.nextInt();
        System.out.println("Nhap lệ phí thi : ");
        lePhiThi = sc.nextDouble();
        System.out.println("Nhập giới tính : ");
        gioiTinh = sc.next().charAt(0);
    }

    public static void main(String[] args) {

        //Khởi tạo đối tượng
        BaiThucHanh1 b = new BaiThucHanh1();
        b.nhapThongTin();
        System.out.println(b.name+" "+b.address+" "+b.soLanThi+" "+b.lePhiThi+" "+b.gioiTinh);
    }
}
