import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        System.out.println("Dãy Fibonacci từ 1 đến " + n + ":");
        int a = 0, b = 1;
        while (a <= n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
