import java.util.Scanner;

public class BaiTapTuLam7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số thứ hai ");
        int b = sc.nextInt();
        System.out.println("Nhập vào số thứ ba ");
        int c = sc.nextInt();
        System.out.println("Nhập vào số thứ tư ");
        int d = sc.nextInt();

        int max1 = a;
        int max2 = b;
        int max = max1;

        if(b > max1)
        {
            max1 = b;
        }
        if(d > max2)
        {
            max2 = d;
        }
        if(max2 > max)
        {
            max = max2;
        }
        System.out.println("Số lớn nhất trong 4 số đã nhập là : "+max);
    }
}
