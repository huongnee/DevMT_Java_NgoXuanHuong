import java.util.Scanner;

public class BaiThucHanh4 {
    int status;
    public void nhap(){
        System.out.println("Vui Lòng nhập trạng thái của chuon^2");
        System.out.println("1-Bay thấp\n2-Bay cao\n3-Bay thấp\n4-Ngáo ngơ");
        System.out.println("Nhập đê : ");
        Scanner sc = new Scanner(System.in);
        status = sc.nextInt();

    }
    public void dubao(){
        switch (status) {
            case 1:
                System.out.println("Mưa nhé");
                break;
            case 2:
                System.out.println("Nắng to");
                break;
            case 3:
                System.out.println("Râm mát");
                break;
            case 4:
                System.out.println("Ngáo ngơ");
                break;
            default:
                System.out.println("Input error !!!");
                break;
        }
    }

    public static void main(String[] args) {
        BaiThucHanh4 d = new BaiThucHanh4();
        d.nhap();
        d.dubao();
    }
}
