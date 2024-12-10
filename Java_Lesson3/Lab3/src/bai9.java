import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Cuối tuần bạn muốn làm gì?");
            System.out.println("1. Đi học Java");
            System.out.println("2. Đi chơi Công viên ngắm gấu");
            System.out.println("3. Đi (về) nhà nghỉ");
            System.out.println("4. Ra sông Hồng tắm tiên");
            System.out.println("5. Ngủ cả ngày");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Bạn chọn đi học Java.");
                    break;
                case 2:
                    System.out.println("Bạn chọn đi chơi Công viên ngắm gấu.");
                    break;
                case 3:
                    System.out.println("Bạn chọn đi về nhà nghỉ.");
                    break;
                case 4:
                    System.out.println("Bạn chọn ra sông Hồng tắm tiên.");
                    break;
                case 5:
                    System.out.println("Bạn chọn ngủ cả ngày.");
                    break;
                case 6:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 6);
    }
}
