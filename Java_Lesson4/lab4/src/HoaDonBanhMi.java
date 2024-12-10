public class HoaDonBanhMi {
    private String maHoaDon;
    private String ngayLapHoaDon;
    private String tenKhachHang;
    private String diaChiKhach;
    private int soLuongBanh;
    private double giaBanMotChiec;
    private double tongTienHang;
    private double tienKhuyenMai;
    private double tongTienThanhToan;


    public HoaDonBanhMi(String maHoaDon, String ngayLapHoaDon, String tenKhachHang,
                        String diaChiKhach, int soLuongBanh, double giaBanMotChiec) {
        this.maHoaDon = maHoaDon;
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.diaChiKhach = diaChiKhach;
        this.soLuongBanh = soLuongBanh;
        this.giaBanMotChiec = giaBanMotChiec;
        this.tinhTien();
    }


    private void tinhTien() {
        tongTienHang = soLuongBanh * giaBanMotChiec;
        if (soLuongBanh >= 100) {
            tienKhuyenMai = tongTienHang * 0.2; // Giảm 20%
        } else if (soLuongBanh >= 10) {
            tienKhuyenMai = soLuongBanh * giaBanMotChiec * 0.1; // Giảm giá mỗi chiếc bánh 10%
        } else {
            tienKhuyenMai = 0;
        }
        tongTienThanhToan = tongTienHang - tienKhuyenMai;
    }


    public void inHoaDon() {
        System.out.println("=== HÓA ĐƠN BÁNH MÌ ===");
        System.out.println("Mã hóa đơn: " + maHoaDon);
        System.out.println("Ngày lập hóa đơn: " + ngayLapHoaDon);
        System.out.println("Tên khách hàng: " + tenKhachHang);
        System.out.println("Địa chỉ khách: " + diaChiKhach);
        System.out.println("Số lượng bánh: " + soLuongBanh);
        System.out.println("Giá một chiếc bánh: " + giaBanMotChiec + " VND");
        System.out.println("Tổng tiền hàng: " + tongTienHang + " VND");
        System.out.println("Tiền khuyến mãi: " + tienKhuyenMai + " VND");
        System.out.println("Tổng tiền phải thanh toán: " + tongTienThanhToan + " VND");
    }
}
