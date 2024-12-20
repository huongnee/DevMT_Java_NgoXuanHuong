package baiTapTuLam2;

import java.util.Arrays;
import java.util.Scanner;

public class flowerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        flower [] fl = null;
        int n = 0;
        boolean thoat = false;

        while (!thoat) {
            System.out.println("Menu");
            System.out.println("1: Nhập thông tin n loài hoa");
            System.out.println("2: Hiển thị thông tin vừa nhập");
            System.out.println("3: Sắp xếp danh sách tăng dần theo tên hoa");
            System.out.println("4: Tìm kiếm theo flowerID");
            System.out.println("5: Hiển thị tất cả các loại hoa có màu trắng");
            System.out.println("6: Thoát");
            System.out.println("Vui lòng nhập lựa chọn 1-6 : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Vui lòng nhập số lượng loài hoa muốn nhập thông tin");
                    n = sc.nextInt();
                    fl = new flower[n];
                    for (int i = 0; i < fl.length; i++) {
                        fl[i] = new flower();
                        System.out.println("Nhập thông tin cho cây hoa thứ "+(i+1));
                        fl[i].input();
                    }
                    break;
                case 2:
                    System.out.println("Thông tin của các bông hoa mới nhập là");
                    if(fl == null || fl.length == 0)
                    {
                        System.out.println("Chưa có thông tin để hiển thị");
                    }
                    else {
                        for (int i = 0; i < fl.length; i++) {
                            fl[i].display();
                        }
                    }
                    break;
                    case 3:
                        System.out.println("Sắp xếp theo tên hoa tăng dần");
                        if(fl == null || fl.length == 0)
                        {
                            System.out.println("Chưa có thông tin để hiển thị");
                        }
                        else {
                            Arrays.sort(fl,(a,b)->a.getFlowerName().compareTo(b.getFlowerName()));
                            for (int i = 0; i < fl.length; i++) {
                                fl[i].display();
                            }
                        }
                        break;
                        case 4:
                            System.out.println("Tìm kiếm theo mã , vui lòng nhập ");
                            sc.nextLine();
                            String ma = sc.nextLine();
                            for (int i = 0; i < fl.length; i++) {
                                if(fl[i].getFlowerName().equals(ma))
                                {
                                    fl[i].display();
                                }
                            }
                            break;
                            case 5:
                                System.out.println("Hiển thị tất cả các loại hoa có màu trắng ");
                                for (int i = 0; i < fl.length; i++) {
                                    if(fl[i].getColor().equals("trắng"))
                                    {
                                        fl[i].display();
                                    }
                                }
                                break;
                                    case 6:
                                        thoat = true;
                                        break;
            }
        }
    }
}
