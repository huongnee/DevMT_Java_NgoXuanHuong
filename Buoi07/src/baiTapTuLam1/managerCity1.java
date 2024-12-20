package baiTapTuLam1;

import java.util.Arrays;
import java.util.Scanner;

public class managerCity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        City[] tp = null;
        int n = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập thông tin n thành phố");
            System.out.println("2. Hiển thị thông tin vừa nhập");
            System.out.println("3. Sắp xếp thông tin tăng dần theo tên nước");
            System.out.println("4. Tìm kiếm thông tin theo cityId");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Số lượng thành phố bạn muốn nhập thông tin: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    tp = new City[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin của thành phố thứ " + (i + 1) + ":");
                        tp[i] = new City();
                        tp[i].nhap();
                    }
                    break;

                case 2:
                    if (tp == null || tp.length == 0) {
                        System.out.println("Chưa có thông tin thành phố nào để hiển thị.");
                    } else {
                        System.out.println("\nThông tin các thành phố:");
                        for (int i = 0; i < tp.length; i++) {
                            System.out.println("Thành phố thứ " + (i + 1) + ":");
                            tp[i].hienThi();
                        }
                    }
                    break;

                case 3:
                    if (tp == null || tp.length == 0) {
                        System.out.println("Chưa có thông tin thành phố nào để sắp xếp.");
                    } else {
                        Arrays.sort(tp, (city1, city2) -> city1.getCountry().compareTo(city2.getCountry()));
                        System.out.println("\nThông tin các thành phố sau khi sắp xếp theo tên nước:");
                        for (City city : tp) {
                            city.hienThi();
                        }
                    }
                    break;

                case 4:
                    if (tp == null || tp.length == 0) {
                        System.out.println("Chưa có thông tin thành phố nào để tìm kiếm.");
                    } else {
                        System.out.print("Nhập mã thành phố bạn muốn tìm kiếm: ");
                        String ma = sc.nextLine();
                        boolean found = false;
                        for (City city : tp) {
                            if (city.getCityID().equals(ma)) {
                                city.hienThi();
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Không tìm thấy thành phố với mã: " + ma);
                        }
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Chương trình kết thúc.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }

        sc.close();
    }
}
