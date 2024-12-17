package ThucHanh;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        //nhập
        for (int i = 0; i < num.length; i++) {
            int number = (int)(Math.random()*10)+30;
            num[i] = number;
        }
        //xuất
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
