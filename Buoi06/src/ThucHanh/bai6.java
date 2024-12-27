package ThucHanh;

import java.util.Scanner;

public class bai6 {
    // Hàm kiểm tra số hoàn hảo
    public static boolean isPerfectNumber(int n) {
        if (n <= 1) return false; // Số nhỏ hơn hoặc bằng 1 không phải số hoàn hảo
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) { // Duyệt tất cả ước số từ 1 đến n/2
            if (n % i == 0) {
                sum += i; // Cộng các ước số
            }
        }
        return sum == n; // Kiểm tra nếu tổng các ước bằng chính nó
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Nhập các phần tử mảng
        }

        System.out.println("Các số hoàn hảo trong mảng là: ");
        for (int i = 0; i < n; i++) {
            if (isPerfectNumber(arr[i])) { // Kiểm tra từng phần tử trong mảng
                System.out.print(arr[i] + " "); // In ra số hoàn hảo
            }
        }
        scanner.close();
    }
}

