package ThucHanh;

import java.util.Scanner;

public class bai5 {
    public static boolean check(int snt)
    {
        if(snt < 2)
        {
            return false;
        }
        else
        {
            for (int i = 2; i < snt; i++) {
                if(snt % i == 0)
                    return false;
            }
        }
        return true;
    }

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
            if(check(num))
                System.out.println(num + " Là so nguyên tố !");
        }

    }
}
