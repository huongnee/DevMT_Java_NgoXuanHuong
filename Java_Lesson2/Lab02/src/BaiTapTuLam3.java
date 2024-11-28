import java.util.Scanner;

public class BaiTapTuLam3 {
    String name;
    int msv;
    float diemlythuyet,diemthuchanh;
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên : ");
        name = input.nextLine();
        System.out.println("Nhập mã sinh viên : ");
        msv = input.nextInt();
        System.out.println("Điểm lý thuyết :");
        diemlythuyet = input.nextFloat();
        System.out.println("Điểm thực hành :");
        diemthuchanh = input.nextFloat();
    }
    public void check(){
        if(diemlythuyet<4){

            System.out.println("Thi lại lý thuyết");

        }
        else if(diemthuchanh<4)
        {
            System.out.printf("Thi lại thực hành");
        }
        float dtb = (diemlythuyet+diemlythuyet)/2;
        if (dtb < 4) {
            System.out.println("Sinh viên học lại môn java");
        }
        else if (dtb >4 && dtb <= 7) {
            System.out.println("Sinh viên đạt môn java");
        }
        else
        {
            System.out.println("Sinh viên xuất sắc môn java");
        }

    }


    public static void main(String[] args) {
        BaiTapTuLam3 sv1 = new BaiTapTuLam3();
        sv1.input();
        sv1.check();
    }
}
