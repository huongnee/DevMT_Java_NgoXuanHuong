package BaiTapTuLam.Bai5;
import java.util.*;
public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Product> productMap = new HashMap<>();

        System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + i + ":");
            System.out.print("ID: ");
            String proId = scanner.nextLine();
            System.out.print("Tên sản phẩm: ");
            String proName = scanner.nextLine();
            System.out.print("Nhà sản xuất: ");
            String producer = scanner.nextLine();
            System.out.print("Năm sản xuất: ");
            int yearMaking = scanner.nextInt();
            System.out.print("Giá: ");
            float price = scanner.nextFloat();
            scanner.nextLine();

            Product product = new Product(proId, proName, producer, yearMaking, price);
            productMap.put(i, product);
        }

        System.out.println("\nDanh sách sản phẩm:");
        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        List<Product> sortedProducts = new ArrayList<>(productMap.values());
        sortedProducts.sort(Comparator.comparingInt(Product::getYearMaking));

        System.out.println("\nDanh sách sản phẩm sau khi sắp xếp theo năm sản xuất:");
        for (Product product : sortedProducts) {
            System.out.println(product);
        }
    }
}
