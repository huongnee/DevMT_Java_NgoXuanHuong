package lab09.baiThucHanh2;

import java.util.Scanner;

public class MainClass {
    public void nhapDuLieu(){
        nhapLieu n = new nhapLieu();
        System.out.println("Nhập số nguyên ");
        System.out.println("Value : "+" "+n.inputInt());;
        System.out.println("Nhập chuỗi ");
        System.out.println("Value : "+n.inputString());
        System.out.println("Nhập số thực ");
        System.out.println("Value : "+" "+n.inputFloat());;
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.nhapDuLieu();
    }

    private class nhapLieu{
        public String inputString()
        {
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
        public int inputInt()
        {
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        }
        public float inputFloat()
        {
            Scanner sc = new Scanner(System.in);
            return sc.nextFloat();
        }
    }
}
