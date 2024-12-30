package lab09.baiTapTuLam2;

import java.util.*;

public class Yamaha {
    public static void main(String[] args) {
        List<Jupiter> jupiters = new ArrayList<>();
        List<Sirius> siriuses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin 3 xe Jupiter:");
                    for (int i = 0; i < 3; i++) {
                        Jupiter j = new Jupiter();
                        j.inputInfor();
                        jupiters.add(j);
                    }
                    System.out.println("Nhập thông tin 3 xe Sirius:");
                    for (int i = 0; i < 3; i++) {
                        Sirius s = new Sirius();
                        s.inputInfor();
                        siriuses.add(s);
                    }
                    break;
                case 2:
                    System.out.println("Thông tin xe Jupiter:");
                    for (Jupiter j : jupiters) {
                        j.displayInfor();
                    }
                    System.out.println("Thông tin xe Sirius:");
                    for (Sirius s : siriuses) {
                        s.displayInfor();
                    }
                    break;
                case 3:
                    jupiters.sort(Comparator.comparingInt(Jupiter::getWarranty));
                    siriuses.sort(Comparator.comparingInt(Sirius::getWarranty));
                    System.out.println("Xe Jupiter sau sắp xếp:");
                    for (Jupiter j : jupiters) {
                        j.displayInfor();
                    }
                    System.out.println("Xe Sirius sau sắp xếp:");
                    for (Sirius s : siriuses) {
                        s.displayInfor();
                    }
                    break;
                case 4:
                    System.out.println("Tìm kiếm xe Serius:");
                    for (Sirius s : siriuses) {
                        if ("Serius".equalsIgnoreCase(s.getName())) {
                            s.displayInfor();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Tạm biệt !");
                    return;
                default:
                    System.out.println("Lựa chọn chả phù hợp");
            }
        }
    }
}
