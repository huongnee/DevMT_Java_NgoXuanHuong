package ThucHanh;

import java.util.Scanner;

public class BaiThucHanh01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số lượng sinh viên muốn nhập : ");
        int n = sc.nextInt();
        String [] sinhvien = new String[n];

        //NHập
        for (int i = 0; i < sinhvien.length; i++) {
            System.out.println("Nhập sinh viên thứ "+(i+1));
            //Mảng có kiê dữ liệu nguyên thủy thì ko câ khai báo riêng nữa
            sinhvien[i] = sc.next();
        }
        //Xuất
        for (int i = 0; i < sinhvien.length; i++) {
            System.out.println("Sinh viên thứ "+(i+1)+sinhvien[i]);
        }

    }
}
