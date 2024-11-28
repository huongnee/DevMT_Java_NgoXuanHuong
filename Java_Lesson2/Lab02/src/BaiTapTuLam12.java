import java.util.Scanner;

public class BaiTapTuLam12 {
    int toan,ly,hoa;
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập điểm toán : ");
        toan = sc.nextInt();
        System.out.println("Vui lòng nhập điểm lý : ");
        ly = sc.nextInt();
        System.out.println("Vui lòng nhập điểm hóa : ");
        hoa = sc.nextInt();
    }
    public void check()
    {
        if(((toan+ly+hoa) > 15) && toan > 4 && ly > 4 && hoa > 4)
        {
            System.out.println("Thi đậu !!!");
            if(toan > 5 && ly > 5 && hoa > 5)
            {
                System.out.println("Học đều các môn");
            } else
            {
                System.out.println("Học chưa đều các môn");
            }

        }
        else {
            System.out.println("Thi hỏng");
        }

    }

    public static void main(String[] args) {}
}
