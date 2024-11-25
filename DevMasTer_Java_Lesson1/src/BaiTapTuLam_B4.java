import java.util.Scanner;

public class BaiTapTuLam_B4 {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập 1 số nguyên bất kỳ ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Vui lòng nhập 1 số thực bất kỳ ");
        float m = sc.nextFloat();
        System.out.println("Vui lòng nhập 1 xâu ký tự bất kỳ ");
        String x = sc.nextLine();
        System.out.println("Số nguyên vùa nhập là "+n+" Số thực vùa nhập là "+m+" Xâu ký tự vừa nhập là "+x);
    }
}
