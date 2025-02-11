package ChuaBaiCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập số lượng số nguyên");
        int number = sc.nextInt();
        //Nhập
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập số thứ "+(i+1));
            list.add(sc.nextInt());
        }
        //Xuât
        System.out.println("Danh sách các phần tử đã nhập");
        for(Integer i : list) {
            System.out.println(i);
        }
        //Sắp xếp tăng dần
        for (int i = 0; i < number-1; i++) {
            for (int j = i+1; j < number; j++) {
                if(list.get(i)>list.get(j)) {
                    int tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
        System.out.println("Danh sách các phần tử sắp xếp tăng dần là");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
