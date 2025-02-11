package demo;

import java.util.Scanner;

public class Mathematics {
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
        System.out.println("Xong");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mathematics math = new Mathematics();
        math.Devide(10, 0);
        boolean ck =true;
//        math.Devide2(101, 0); để ko này nó dừng k chạy nữa lun
        while(ck){
            System.out.println("Nhập a");
            float num1 = sc.nextFloat();
            System.out.println("Nhập b");
            float num2 = sc.nextFloat();
            try{
                math.Devide2(num1, num2);
                ck = false;
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
