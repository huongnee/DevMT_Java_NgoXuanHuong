import java.util.Scanner;

public class BaiTapTuLam6 {
    int a,b,c;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a : ");
        a = sc.nextInt();
        System.out.println("Nhập vào số b : ");
        b = sc.nextInt();
        System.out.println("Nhập vào số c : ");
        c = sc.nextInt();

    }
    public void check(){
        if(a > 0 && b > 0 && c > 0 && ((a+b) > c) && ((a+c) > b) && ((b+c) > a)){
            System.out.println("3 số a,b,c là 1 tam giác");
            System.out.println("Chu vi tam giác là "+(a+b+c));
            System.out.println("Diện tích tam giác là "+(a*b*c));
        }
        else
            System.out.println("3 số a,b,c không phải là 1 tam giác");
    }

    public static void main(String[] args) {
        BaiTapTuLam6 bt = new BaiTapTuLam6();
        bt.nhap();
        bt.check();
    }
}
