import java.util.Scanner;

public class BaiTapTuLam_B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập 1 số nguyên bất kỳ ");
        int n1 = sc.nextInt();
        System.out.println("Vui lòng nhập 1 số thực bất kỳ ");
        float m1 = sc.nextFloat();
        System.out.println("Vui lòng nhập 1 số nguyên bất kỳ ");
        int n2 = sc.nextInt();
        System.out.println("Vui lòng nhập 1 số thực bất kỳ ");
        float m2 = sc.nextFloat();

        System.out.println("Tổng của 2 số nguyên n1 + n2 vừa nhập là : "+(n1+n2));
        System.out.println("Tổng của 2 số thực m1 + m2 vừa nhập là : "+(m1+m2));
        System.out.println("Tổng của 2 số n1 + m2 vừa nhập là : "+(n1+m2));

    }
}
