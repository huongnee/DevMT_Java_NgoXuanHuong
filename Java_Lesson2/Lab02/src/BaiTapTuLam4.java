import java.util.Scanner;

public class BaiTapTuLam4 {
    //hàm giải pt bậc 1

    public void giaiPTB1(float a , float b)
    {
        if(a==0)
        {
            if(b==0)
            {
                System.out.printf("\n PT : %.1f.x + %.1f = 0 => Có vô số nghiệm ",a,b);
            } else
            {
                System.out.printf("\n PT : %.1f.x + %.1f = 0 =>  vô nghiệm ",a,b);
            }
        }
        else
        {
            float x=-b/a;
            System.out.println(System.out.printf("\n PT : %.1f.x + %.1f = 0 => Có nghiệm x = %.1f ",a,b));
        }
    }
    public void giaiPTB2(float a , float b,float c)
    {
        if(a==0)
        {
            //giải bậc 1
            giaiPTB1(b,c);
        }
        else
        {
            float delta = b*b - 4*a*c;
            if(delta<0)
            {
                System.out.printf("\n PT : %.1f.x^2 + %.1f.x + %.1f = 0 => vô nghiệm ",a,b,c);
            }
            else if (delta==0)
            {
                float x=-b/(2*a);
                System.out.printf("\n PT : %.1f.x^2 + %.1f.x + %.1f = 0 => có 1 nghiệm kép x = %.1f ",a,b,c,x);
            }
            else
            {
                double x1 = (-b-Math.sqrt(delta))/(2*a);
                double x2 = (-b+Math.sqrt(delta))/(2*a);
                System.out.printf("\n PT : %.1f.x^2 + %.1f.x + %.1f = 0 ",a,b,c);
                System.out.println("Phuong trinh co hai nghiem phan biet la ");
                System.out.println("X1 = "+x1);
                System.out.println("X2 = "+x2);
            }
        }
    }

    public static void main(String[] args) {
        BaiTapTuLam4 obj = new BaiTapTuLam4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập số a ");
        float a = sc.nextFloat();
        System.out.println("Vui lòng nhập số b ");
        float b = sc.nextFloat();
        System.out.println("Vui lòng nhập số c ");
        float c = sc.nextFloat();
        obj.giaiPTB2(a,b,c);
    }
}
