package ThucHanh;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiThucHanh04 {
    ArrayList<Book> listbook = new ArrayList<>();
    public void nhapDuLieu(){
        System.out.println("So sach muon nhap");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap nhap du lieu cuon sach "+i);
            Book book = new Book();
            book.nhapDuLieu();
            listbook.add(book);
        }
    }
    public void hienThiDanhSach(){
        System.out.println("So sach muon hien"+listbook.size());
        for (int i = 0; i < listbook.size(); i++) {
            System.out.println(listbook.get(i).toString());
        }
    }
    public void sapXep()
    {

    }
    public int showMenu()
    {
        System.out.println("Menu");
        System.out.println("1. Nhap Du Lieu");
        System.out.println("2.  Hien thiDanhSach");
        System.out.println("3.  XOa");
        System.out.println("4. Thoat");
        System.out.println("Nhap tu 1-4");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        BaiThucHanh04 b = new BaiThucHanh04();
        int choice ;
        do{
            choice = b.showMenu();
            switch (choice) {
                case 1:
                    b.nhapDuLieu();
                    break;
                        case 2:
                            b.hienThiDanhSach();
                            break;
                        case 3:
                            b.sapXep();
                            break;
                            case 4:
                                System.exit(0);//THoát khỏi vòng lặp kết thúc
                                break;
                default:
                    System.out.println("Bạn chọn sai");
                    break;
            }
        }
        while (true);
    }
}
