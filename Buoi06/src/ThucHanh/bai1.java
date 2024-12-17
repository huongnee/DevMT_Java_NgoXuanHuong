package ThucHanh;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] soNguyen = new int[10];

        //Nhập
        for (int i = 0; i < soNguyen.length; i++) {
            System.out.println("Nhập số thứ "+(i+1));
            soNguyen[i] = sc.nextInt();
        }
        //Xuất
        for (int i = 0; i < soNguyen.length; i++) {
            System.out.println(soNguyen[i]);
        }
    }
}
