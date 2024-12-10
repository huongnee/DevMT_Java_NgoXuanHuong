import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("ƯCLN: " + gcd);
        System.out.println("BCNN: " + lcm);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

