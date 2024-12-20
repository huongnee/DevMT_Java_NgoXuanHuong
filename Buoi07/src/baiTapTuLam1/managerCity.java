package baiTapTuLam1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class managerCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số lượng thành phố bạn muốn nhập thông tin : ");
        int n = sc.nextInt();
        City [] tp = new City[n];
        //Nhập
        for (int i = 0; i < tp.length; i++) {
            System.out.println("Nhập thông tin của thành phố thứ "+(i+1));
            tp[i] = new City();
            tp[i].nhap();
        }
        //Hiển thị
        for (int i = 0; i < tp.length; i++) {
            System.out.println("Hiển thị thông tin của thành phố thu "+(i+1));

        }
        //Sắp sếp thông tin tăng dần theo tên nước
        Arrays.sort(tp, (city1, city2) -> city1.getCountry().compareTo(city2.getCountry()));

        // Hiển thị thông tin sau khi sắp xếp
        System.out.println("\nThông tin các thành phố sau khi sắp xếp theo tên nước:");
        for (int i = 0; i < tp.length; i++) {
            tp[i].hienThi();
        }
        // Tìm kiếm thông tin theo cityID
        System.out.println("Nhập mã thành phố bạn muốn tìm kiếm thông tin : ");
        sc.nextLine();
        String ma = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < tp.length; i++) {
            if(tp[i].getCityID().equals(ma))
            {
                tp[i].hienThi();
                found = true;
                break;
            }
        }
        if (!found) {
             System.out.println("Mã này không tồn tại");
        }


//        if (tp[i].getCityID().equals(String.valueOf(ma)))
//        if (Integer.parseInt(tp[i].getCityID()) == ma)


    }
}
