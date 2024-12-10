import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tổng từ 1 đến " + n + " là: " + sum);
    }
}
