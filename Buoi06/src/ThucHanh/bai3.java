package ThucHanh;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số n : ");
        int n = sc.nextInt();
        int [] number = new int[n];
        //Nhập
        for (int i = 0; i < n; i++) {
            System.out.println("Vui lòng nhập : ");
            number[i] = sc.nextInt();
        }
        //Xuất
        for(var num : number)
        {
            System.out.println(num);

        }
    }
}
