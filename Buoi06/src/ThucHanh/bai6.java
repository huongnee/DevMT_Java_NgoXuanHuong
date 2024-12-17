package ThucHanh;

import java.util.Scanner;

public class bai6 {
    // Hàm kiểm tra số hoàn hảo
    public static boolean isPerfectNumber(int n) {
        if (n <= 1) return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Các số hoàn hảo trong mảng là: ");
        for (int i = 0; i < n; i++) {
            if (isPerfectNumber(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        scanner.close();
    }
}

