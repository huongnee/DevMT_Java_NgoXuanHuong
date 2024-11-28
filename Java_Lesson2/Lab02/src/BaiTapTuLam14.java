import java.util.Scanner;

public class BaiTapTuLam14 {
    int chisocu,chisomoi;
    public void nhapchiso(){

        while (chisocu>chisomoi)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập chỉ số cũ ");
            chisocu= sc.nextInt();
            System.out.printf("Nhập chỉ số mới ");
            chisomoi= sc.nextInt();
        }

    }
    public static void main(String[] args) {

    }
}
