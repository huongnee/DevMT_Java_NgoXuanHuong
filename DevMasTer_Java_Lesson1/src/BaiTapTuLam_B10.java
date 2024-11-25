import java.util.Scanner;

public class BaiTapTuLam_B10 {
    public static void main(String[] args) {
        //trường hợp a = 0 thì quay lại giải ptb1
        System.out.println("Giai phuong trinh: ax^2 + bx + c = 0 (a ≠ 0)");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao a");
        double a = input.nextDouble();
        System.out.println("Nhap vao b");
        double b = input.nextDouble();
        System.out.println("Nhap vao c");
        double c = input.nextDouble();
        double denta = b*b - (4*a*c);
        System.out.println("Gia tri cua denta la "+denta);
        double a1 = Math.sqrt(denta);
        if(denta<0)
        {
            System.out.println("Phuong trinh vo nghiem");
        }
        else if(denta==0)
        {
            double d =(-b/2*a);
            System.out.println("Phuong trinh co 1 nghiep kep X = "+d);
        }
        else
        {
            double e = (-b-Math.sqrt(denta))/(2*a);
            double f = (-b+Math.sqrt(denta))/(2*a);
            System.out.println("Phuong trinh co hai nghiem phan biet la ");
            System.out.println("X1 = "+e);
            System.out.println("X2 = "+f);

        }
    }
}
