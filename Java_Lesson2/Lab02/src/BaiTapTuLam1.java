import java.util.Scanner;

public class BaiTapTuLam1 {
    String name,address;
    double salary;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your address");
        address=sc.nextLine();
        System.out.println("Enter your salary");
        salary=sc.nextDouble();
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args) {
        BaiTapTuLam1 obj=new BaiTapTuLam1();
        obj.input();
        obj.display();
    }
}
