import java.util.Scanner;

public class BaiTapTuLam2 {
    String name,nsx;
    int soLuongBanhXe;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập name :");
        name = sc.nextLine();
        System.out.println("Nhập nsx :");
        nsx = sc.nextLine();
        System.out.println("Nhập Số Luợng :");
        soLuongBanhXe = sc.nextInt();
    }
    public void display(){
        System.out.println(name);
        System.out.printf("nsx : %s",nsx);
        System.out.println(soLuongBanhXe);
    }


    public static void main(String[] args) {
        BaiTapTuLam2 bt = new BaiTapTuLam2();
        bt.nhap();
        bt.display();

    }
}
