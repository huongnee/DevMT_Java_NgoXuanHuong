package BaiTapThucHanh;

import java.util.Arrays;

public class SinhVienManagement {
    String [] arrSinhVien ;
    public SinhVienManagement() {
        arrSinhVien = new String[0];
    }
    private void moRong(){
        int size = this.arrSinhVien.length + 1;
        String [] temp = Arrays.copyOf(this.arrSinhVien, size);
        this.arrSinhVien = new String[size];
        System.arraycopy(temp, 0, this.arrSinhVien, 0, size);
    }
    public void themSinhVien(String name , int pos){
        try{
            this.arrSinhVien[pos - 1] = name;

        }
        catch(ArrayIndexOutOfBoundsException e){
            moRong();
            arrSinhVien[arrSinhVien.length - 1] = name;
        }
    }
    public void hienThi(){
        for(int i = 0 ; i < arrSinhVien.length ; i++){
            String arrSinhVien1 = this.arrSinhVien[i];
            System.out.println(arrSinhVien1);
        }
    }

    public static void main(String[] args) {
        SinhVienManagement sm = new SinhVienManagement();
        sm.themSinhVien("Dev",10);
        sm.themSinhVien("Dev1",10);
        sm.themSinhVien("Dev2",10);

        sm.hienThi();
    }
}
