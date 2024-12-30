package lab09.baiTapTuLam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> list = new ArrayList<>();
        boolean lc = true;
        while(lc){
            System.out.println("============== MENU ================");
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort by price");
            System.out.println("4. Search by model");
            System.out.println("5. Exit");
            System.out.println("=====================================");
            System.out.println("Vui lòng nhập lựa chọn từ 1-5");
            int n = sc.nextInt();
            switch (n){
                case 1:
                    for (int i = 0; i < 3; i++) {
                        //khai báo 1 đối tượng car
                        Car c = new Car();
                        c.input();
                        //thêm vào ds tổng
                        list.add(c);
                    }
                    for (int i = 0; i < 3; i++) {
                        //khai báo 1 đối tượng truck
                        Truck t = new Truck();
                        t.input();
                        //thêm vào ds tổng
                        list.add(t);
                    }
                    break;
                case 2:
                   for (int i = 0; i < list.size(); i++) {
                       System.out.println("Sản phẩm thứ "+(i+1));
                       list.get(i).display();
                   }
                   break;
                case 3:
                    System.out.println("Chưa sắp");
                    System.out.println("...");
                    System.out.println("Sắp xếp tăng dần");
                    Collections.sort(list,(a,b) -> Double.compare(a.getPrice(),b.getPrice()));
                    break;
                    //Giảm dần
//                System.out.println("Chưa sắp");
//                System.out.println("...");
//                System.out.println("Sắp xếp tăng dần");
//                Collections.sort(list,(a,b) -> Double.compare(b.getPrice(),a.getPrice()));
//                break;
//                case 4:
//                    System.out.println("Nhập vào model cần tìm kiếm");
//                    String model = sc.nextLine();
//                    for (int i = 0; i < list.size(); i++) {
//                        if(list.get(i).equals(model)){
//                            list.get(i).display();
//                        }
//                    }
//                        break;
                case 5 :
                    lc = false;
                    break;
                case 4:
                    System.out.println("Nhập vào model cần tìm kiếm:");
                    sc.nextLine(); // Đọc dòng trống còn sót do nextInt() trước đó
                    String model = sc.nextLine(); // Nhập model từ người dùng
                    boolean found = false; // Biến kiểm tra xem có tìm thấy hay không

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getModel().equalsIgnoreCase(model)) { // So sánh model
                            System.out.println("Tìm thấy sản phẩm với model:");
                            list.get(i).display(); // Hiển thị thông tin phương tiện
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy phương tiện có model: " + model);
                    }
                    break;

            }
        }
    }
}
