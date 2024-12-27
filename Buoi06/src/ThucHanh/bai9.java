package ThucHanh;

import java.util.Scanner;

public class bai9 {
    // Hàm sắp xếp Nổi bọt
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Hoán đổi nếu phần tử trước lớn hơn phần tử sau
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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

        bubbleSort(arr); // Gọi hàm sắp xếp

        System.out.println("Mảng sau khi sắp xếp tăng dần: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}

