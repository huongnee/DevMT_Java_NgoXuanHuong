import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int h = scanner.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == h) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
