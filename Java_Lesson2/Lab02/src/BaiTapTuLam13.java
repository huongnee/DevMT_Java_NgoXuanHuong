import java.util.Scanner;

public class BaiTapTuLam13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số giờ làm : ");
        int hours = sc.nextInt();
        System.out.println("Nhập vào số tiền lương 1 giờ làm : ");
        float salary = sc.nextFloat();
        float sum ;
        int giodu;
        if( hours <= 40 )
        {
            sum = hours*salary;
        }
        else
        {
            giodu = hours - 40;
            float sum1 = 40*salary;
            float sum2 = giodu*salary*1.5f;
            sum = sum1 + sum2;
        }
        System.out.println("Tổng số tiền lương là : "+sum);
    }
}
