package BaiTapTuLam;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Product> products = new TreeMap<>();

        System.out.print("Nhập vào số lượng sản phẩm ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for product " + i + ":");
            System.out.print("Product ID: ");
            String proId = scanner.nextLine();
            System.out.print("Name: ");
            String proName = scanner.nextLine();
            System.out.print("Producer: ");
            String producer = scanner.nextLine();
            System.out.print("Year of Making: ");
            int yearMaking = Integer.parseInt(scanner.nextLine());
            System.out.print("Price: ");
            float price = Float.parseFloat(scanner.nextLine());

            Product product = new Product(proId, proName, producer, yearMaking, price);
            products.put(i, product);
        }

        System.out.println("\nDanh sách");
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

//        System.out.println("\nProducts Sắp xếp: ");
//        products.entrySet().stream()
//                .sorted((e1, e2) -> Integer.compare(e1.getValue().getYearMaking(), e2.getValue().getYearMaking()))
//                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
    }
}
