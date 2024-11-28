import java.util.Scanner;

public class BaiTapTuLam11 {
    public static void main(String[] args) {
        int a,b;
        float result = 0.f;
        String lc;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number a : ");
        a = sc.nextInt();
        System.out.println("Enter first number b : ");
        b = sc.nextInt();
        sc.nextLine();
        System.out.println("Vui lòng chọn phép tính muốn tính :");

        lc = sc.nextLine();
        switch (lc)
        {
            case "+":
                result = a + b;
                System.out.println(result);
                break;
            case "-":
                result = a + b;
                System.out.println(result);
                break;
            case "*":
                result = a + b;
                System.out.println(result);
                break;
            case "/":
                if(b==0)
                {
                    System.out.println("Không chia được");
                }
                else
                {
                    result = (float) a / b;
                    System.out.println(result);
                }
                break;
            case "%":
                result = a % b;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid input");
        }

        System.out.println(result);
    }
}
