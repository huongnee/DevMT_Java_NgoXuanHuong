import java.util.Scanner;

public class baii7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = scanner.nextInt();

        // a
        System.out.println("Các số lẻ < N:");
        for (int i = 1; i < N; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // b
        int sumSquares = 0;
        for (int i = 1; i < N; i += 2) {
            sumSquares += i * i;
        }
        System.out.println("Tổng bình phương của các số lẻ < N: " + sumSquares);

        // c
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        double average = (double) sum / N;
        System.out.println("Các số chẵn > trung bình cộng: ");
        for (int i = 2; i <= N; i += 2) {
            if (i > average) {
                System.out.print(i + " ");
            }
        }
    }
}
