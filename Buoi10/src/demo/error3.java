package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class error3 {
    public void Devide(float num1, float num2){
        float result ;
        try{
            result = num1 / num2;
            System.out.printf("%f / %f = %.2f \n", num1, num2, result);

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Run ...");

    }
    public void Devide2(float num1, float num2) throws ArithmeticException{
        if(num2 == 0)
        {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        else
        {
            System.out.printf("%f / %f = %.2f \n", num1, num2, (num1 / num2));

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        error3 obj = new error3();
        boolean ck = true;

        while (ck) {
            try {
                System.out.println("Nhập a");
                float num1 = sc.nextFloat();
                System.out.println("Nhập b");
                float num2 = sc.nextFloat();
                obj.Devide2(num1, num2);
                ck = false; // Thoát khỏi vòng lặp nếu không có lỗi
            } catch (ArithmeticException e) {
                System.out.println("Lỗi: " + e.getMessage() + ". Vui lòng nhập lại.");
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
                sc.nextLine(); // Xóa giá trị không hợp lệ khỏi bộ nhớ đệm
            }
        }
    }
}
