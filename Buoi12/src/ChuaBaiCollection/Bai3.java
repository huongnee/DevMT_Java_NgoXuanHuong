package ChuaBaiCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Map<Integer, String> mapCountries = new HashMap<Integer,String>();
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            try{
                System.out.println("Input number of countries: ");
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
            System.out.println("Nhập quốc gia thứ "+(i+1));
            mapCountries.put(i, sc.nextLine());

        }
        //Xuất
        System.out.println("Danh sách các quốc gia");
        for (Map.Entry<Integer, String> entry : mapCountries.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //Sắp xếp

    }
}
