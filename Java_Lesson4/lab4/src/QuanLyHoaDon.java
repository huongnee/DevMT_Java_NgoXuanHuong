import java.util.Scanner;

public class QuanLyHoaDon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin hóa đơn
        System.out.print("Nhập mã hóa đơn: ");
        String maHoaDon = scanner.nextLine();
        System.out.print("Nhập ngày lập hóa đơn: ");
        String ngayLapHoaDon = scanner.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        String tenKhachHang = scanner.nextLine();
        System.out.print("Nhập địa chỉ khách hàng: ");
        String diaChiKhach = scanner.nextLine();
        System.out.print("Nhập số lượng bánh cần giao: ");
        int soLuongBanh = scanner.nextInt();
        System.out.print("Nhập giá bán một chiếc bánh: ");
        double giaBanMotChiec = scanner.nextDouble();

        HoaDonBanhMi hoaDon = new HoaDonBanhMi(maHoaDon, ngayLapHoaDon, tenKhachHang,
                diaChiKhach, soLuongBanh, giaBanMotChiec);

        hoaDon.inHoaDon();
    }
}
