import java.util.Scanner;

public class BaiThucHanh3 {
    int a,b,result;
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a ");
        a = sc.nextInt();
        System.out.println("Nhập số b ");
        b = sc.nextInt();
    }
    public void giaiPhuongTrinh()
    {
        if(a!=0)
        {
            System.out.println("Phương trình có 1 nghiệm duy nhất "+((float)-b/a));
        }
        else
        {
            if(b==0)
            {
                System.out.println("Phương trình vô số nghiệm");
            }
            else
            {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
    public static void main(String[] args) {
        BaiThucHanh3 obj = new BaiThucHanh3();
        obj.nhap();
        obj.giaiPhuongTrinh();
    }
}
