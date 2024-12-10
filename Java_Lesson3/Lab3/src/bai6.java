import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int d = scanner.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int r = scanner.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= d; j++) {
                if (i == 1 || i == r || j == 1 || j == d) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
