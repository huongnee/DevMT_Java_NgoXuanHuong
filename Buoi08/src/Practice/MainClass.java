package Practice;

import demoExample.Circle;

import java.util.Scanner;

public class MainClass {
    public int showMenu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Tính diện tích hình tròn");
        System.out.println("2.Tính diện tích hình chữ nhật");
        System.out.println("3.Tính diện tích hình tam giác");

        return sc.nextInt();
    }
    public void tinhDienTich(Shape hinh)
    {
        hinh.inputData();
        hinh.calArea();
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        int choi = 0;
        do {
            choi = mainClass.showMenu();
            switch (choi)
            {
                case 1:
                    mainClass.tinhDienTich(new Cricle());
                    break;
                case 2:
                    mainClass.tinhDienTich(new Rectangle());
                    break;
                case 3:
                    mainClass.tinhDienTich(new Tritangle());
                    break;

            }
        }while (choi > 0 && choi < 4);
        System.out.println("End !");
    }
}
