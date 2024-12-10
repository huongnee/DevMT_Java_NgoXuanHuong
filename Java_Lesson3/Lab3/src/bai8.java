import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.println("Giai thừa của " + N + " là: " + factorial);
    }
}

