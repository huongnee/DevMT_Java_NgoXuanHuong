import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        System.out.println("Các số hoàn hảo từ 1 đến " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
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

