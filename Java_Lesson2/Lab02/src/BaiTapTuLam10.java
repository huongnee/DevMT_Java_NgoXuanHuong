import java.util.Scanner;

public class BaiTapTuLam10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ký tự màu : ");
        String color = sc.nextLine();
        switch (color) {
            case "R", "r":
                System.out.println("RED");
                break;
            case "G", "g":
                System.out.println("GREEN");
                break;
            case "B", "b":
                System.out.println("BLUE");
                break;
            default:
                System.out.println("BLACK");
                break;
        }
    }
}
