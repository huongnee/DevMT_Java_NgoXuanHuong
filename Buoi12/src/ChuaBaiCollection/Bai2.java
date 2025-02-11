package ChuaBaiCollection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Bai2 {
    public static void main(String[] args) {
        Set<String> cities = new TreeSet<String>();
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            try{
                System.out.println("Số lượng thành phố muốn nhập");
                 n = sc.nextInt();
                sc.nextLine();
                break;
            }catch (Exception e)
            {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            };
        }while(true);

        //Nhập
        for (int i = 0; i < n; i++) {

            System.out.println("Nhập tên thành phố thu ");
            cities.add(sc.nextLine());
        }

        //Xuất
        for (String city : cities) {
            System.out.println(city);
        }

        //Sắp xếp - nếu là TreeSet thì mặc định no sắp xếp tăng dần r


    }
}
