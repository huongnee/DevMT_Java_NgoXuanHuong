package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class error2 {
    public void Devide(float num1, float num2) {
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Không thể chia cho 0 (số dấu phẩy động)");
            }
            float result = num1 / num2;
            System.out.printf("%f / %f = %.2f \n", num1, num2, result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            System.out.println("Đã xong");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        error2 obj = new error2();
        boolean ck =true;
//        math.Devide2(101, 0); để ko này nó dừng k chạy nữa lun

            while (ck) {
                System.out.println("Nhập a");
                float num1 = sc.nextFloat();
                System.out.println("Nhập b");
                float num2 = sc.nextFloat();
                try {
                    obj.Devide(num1, num2);
                    ck = false; // Chỉ đặt false khi phép tính thành công
                } catch (ArithmeticException e) {
                    System.out.println("Lỗi: " + e.getMessage() + ". Vui lòng nhập lại.");
                }
            }

        }


    }
