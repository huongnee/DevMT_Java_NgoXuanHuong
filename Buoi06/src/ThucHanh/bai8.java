package ThucHanh;

import java.util.Scanner;

public class bai8 {
    // Hàm sắp xếp Chọn trực tiếp
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Giả sử phần tử đầu tiên là nhỏ nhất
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { // Tìm phần tử nhỏ nhất còn lại
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên của dãy chưa sắp xếp
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
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

        selectionSort(arr); // Gọi hàm sắp xếp

        System.out.println("Mảng sau khi sắp xếp tăng dần: ");
        for (int i : arr) {
            System.out.print(i + " "); // In mảng đã sắp xếp
        }
        scanner.close();
    }
}

