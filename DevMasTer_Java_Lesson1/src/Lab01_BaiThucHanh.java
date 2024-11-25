import java.util.Scanner;

public class Lab01_BaiThucHanh {
    public static void main(String[] args) {
        //Bài thực hành 1
        System.out.println("Chào mừng đến thế giới JAVA");
        System.out.println("------------------------------------------------------");
        //Bài thực hành 2
        System.out.print("Vui Lòng nhập tên của bạn : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Chào bạn "+name+" Chúc bạn một ngày tốt lành");
        System.out.println("------------------------------------------------------");
        //Bài thực hành 3
        System.out.println("Vui lòng nhập tên của bạn");
        sc.next();
        String ten = sc.nextLine();
        System.out.println("Vui lòng nhập tuổi của bạn");
        int age = sc.nextInt();
        System.out.println("Vui lòng nhập điểm lý thuyết của bạn");
        float dlt = sc.nextFloat();
        System.out.println("Vui lòng nhập điểm thực hành của bạn");
        float dtt = sc.nextFloat();
        System.out.println("Thông tin của bạn:");
        System.out.println(name+"-"+age+" Điểm trung bình : "+((dtt+dlt)/2));
    }
}
