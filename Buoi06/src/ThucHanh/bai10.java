package ThucHanh;

import java.util.Scanner;

public class bai10 {
    // Hàm sắp xếp Chèn
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Lấy phần tử cần chèn
            int j = i - 1;
            while (j >= 0 && arr[j] > key) { // Di chuyển các phần tử lớn hơn key sang phải
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Chèn key vào vị trí đúng
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

        insertionSort(arr); // Gọi hàm sắp xếp

        System.out.println("Mảng sau khi sắp xếp tăng dần: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
