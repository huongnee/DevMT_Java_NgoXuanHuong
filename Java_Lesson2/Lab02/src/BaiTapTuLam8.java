import java.util.Scanner;

public class BaiTapTuLam8 {
    public void check(int lc,int year)
    {
        if(year%4==0){
            switch(lc){
                case 1:
                    System.out.println("Tháng này 31 ngày");
                    break;
                case 2:
                    System.out.println("Tháng này 29 ngày");
                    break;
                case 3:
                    System.out.println("Tháng này 31 ngày");
                    break;
                case 4:
                    System.out.println("Tháng này 30 ngày");
                    break;
                case 5:
                    System.out.println("Tháng này 31 ngày");
                    break;
                case 6:
                    System.out.println("Tháng này 30 ngày");
                    break;
                case 7:
                    System.out.println("Tháng này 31 ngày");
                    break;
                case 8:
                    System.out.println("Tháng này 31 ngày");
                    break;
                case 9:
                    System.out.println("Tháng này 30 ngày");
                    break;
                case 10:
                    System.out.println("Tháng này 31 ngày");
                    break;
                case 11:
                    System.out.println("Tháng này 30 ngày");
                    break;
                case 12:
                    System.out.println("Tháng này 31 ngày");
                    break;
            }
        }
        else
            switch(lc){
                case 1:
                    System.out.println("Tháng này 31 ngày");
                    break;
                case 2:
                    System.out.println("Tháng này 28 ngày");
                    break;
                case 3:
                    System.out.println("Tháng này 31 ngày");
                    break;
                case 4:
                    System.out.println("Tháng này 30 ngày");
                    break;
                case 5:
                    System.out.println("Tháng này 31 ngày");
                    break;
                case 6:
                    System.out.println("Tháng này 30 ngày");
                    break;
                case 7:
                    System.out.println("Tháng này 31 ngày");
                    break;
                case 8:
                    System.out.println("Tháng này 31 ngày");
                    break;
                case 9:
                    System.out.println("Tháng này 30 ngày");
                    break;
                case 10:
                    System.out.println("Tháng này 31 ngày");
                    break;
                case 11:
                    System.out.println("Tháng này 30 ngày");
                    break;
                case 12:
                    System.out.println("Tháng này 31 ngày");
                    break;


            }



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm : ");
        int year = sc.nextInt();
        System.out.println("Nhập vào tháng bạn muốn :  ");
        int lc = sc.nextInt();
        BaiTapTuLam8 b = new BaiTapTuLam8();
        b.check(lc,year);
    }
}
