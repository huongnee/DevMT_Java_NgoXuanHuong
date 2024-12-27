package luatdoanhnghiep.khoinhanuoc.tienluong;
//Lab07 - bài 3
public class TienLuong {
    // 3 cái hang hệ số lương
    public static final float BAC_TRUNG_CAP = 1.5f;
    public static final float BAC_CAO_DANG = 1.8f;
    public static final float BAC_DAI_HOC = 2.34f;

    //
    public static final float LUONG_CO_BAN = 2889000f;
    public static final float HE_SO_BHXH = 16f;
    public static final float HE_SO_THAM_NIEN = 5f;

    //Phương thức tính lương cơ bản
    public static double luongCoBan(float hocVi , int namCongTac){
        double luongCB = (hocVi * LUONG_CO_BAN) + namCongTac * (5*LUONG_CO_BAN/100);
        return luongCB;
    }

    /**
     * Java.doc
     *
     */
    public static double soTienBaoHiem(double luong)
    {
        return ((HE_SO_BHXH/100) * luong);
    }

}
