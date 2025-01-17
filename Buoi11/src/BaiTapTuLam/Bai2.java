package BaiTapTuLam;
import java.util.*;
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> cities = new HashSet<>();

        System.out.println("Nhập số lượng thành phố: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tên thành phố thứ " + (i + 1) + ": ");
            cities.add(scanner.nextLine());
        }

        System.out.println("Danh sách các thành phố vừa nhập: ");
        for (String city : cities) {
            System.out.println(city);
        }

        Set<String> sortedCities = new TreeSet<>(cities);
        System.out.println("Danh sách các thành phố tăng dần: ");
        for (String city : sortedCities) {
            System.out.println(city);
        }

    }
}
