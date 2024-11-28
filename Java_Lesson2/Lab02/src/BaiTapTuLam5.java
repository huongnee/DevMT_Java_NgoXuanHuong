import java.util.Scanner;

public class BaiTapTuLam5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n : ");
        int n = sc.nextInt();
        if(n%2==0)
            System.out.println("Số nguyên n vừa nhập là số chẵn");
        else
            System.out.println("Số nguyên n vừa nhập là số lẻ");
    }

}
