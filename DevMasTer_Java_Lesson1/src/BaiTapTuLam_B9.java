import java.util.Scanner;

public class BaiTapTuLam_B9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Phuong trinh bac nhat Ax +B = 0");
        System.out.println("Nhap vao A");
        int a = input.nextInt();
        System.out.println("Nhap vao B");
        int b = input.nextInt();
        float c = (float)-b/a;
        if(a!=0)
        {
            System.out.println("Phuong trinh co 1 nghiem duy nhat la X = "+c);
        }
        else
        {
            if(b!=0)
            {
                System.out.println("Phuong trinh vo nghiem");
            }
            else
            {
                System.out.println("Phuong trinh co vo so nghiem");
            }
        }
    }
}
