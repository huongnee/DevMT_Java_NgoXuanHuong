import java.util.Scanner;

public class BaiTapTuLam_B8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập 1 số  bất kỳ ");
        float n = sc.nextFloat();
        System.out.println("Vui lòng nhập 1 số  bất kỳ ");
        float m = sc.nextFloat();
        System.out.println("Vui lòng nhập 1 số  bất kỳ ");
        float x = sc.nextFloat();
        float max = n;
        if(m > max)
        {
            max = m;
        }
        if(x > max)
        {
            max = x;
        }
        System.out.println("Số lớn nhất trong 3 số vừa nhập là :" +max);
    }
}
