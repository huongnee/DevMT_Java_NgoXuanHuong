package ThucHanh;

import java.util.Scanner;

public class bai4 {
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
        //Max
        int max = number[0];
        for (int i = 0; i < n; i++) {
            if(max < number[i])
                max = number[i];
        }
        System.out.println("Max : "+max);
        //Min
        int min = number[0];
        for (int i = 0; i < n; i++) {
            if(min > number[i])
                min = number[i];
        }
        System.out.println("Min : "+min);
    }
}
