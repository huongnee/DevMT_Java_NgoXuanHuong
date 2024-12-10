import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int n = scanner.nextInt();

        if (isPerfectNumber(n)) {
            System.out.println(n + " là số hoàn hảo.");
        } else {
            System.out.println(n + " không phải là số hoàn hảo.");
        }
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
