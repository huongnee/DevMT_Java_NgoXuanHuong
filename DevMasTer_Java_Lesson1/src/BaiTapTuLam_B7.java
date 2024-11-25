import java.util.Scanner;

public class BaiTapTuLam_B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập 1 số nguyên bất kỳ ");
        int n = sc.nextInt();
        System.out.println("Vui lòng nhập 1 số nguyên bất kỳ ");
        int m = sc.nextInt();
        int max = n;
        if(m > max)
        {
            max = m;
        }
        System.out.println("Số lớn nhất trong 2 số vừa nhập là :" +max);
    }
}
