package BaiTapTuLam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Vui lòng nhập số lượng phần tử muốn nhập");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ "+(i+1));
            list.add(sc.nextInt());
        }
        System.out.println("=========================");
        System.out.println("Hiển thị danh sách trước khi sắp xếp :");
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }

        //Sắp xếp tăng
        Collections.sort(list);
        System.out.println("=========================");
        System.out.println("Hiển thị danh sách sau khi sắp xếp tăng dần :");
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
        //Sắp xếp giảm
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("=========================");
        System.out.println("Hiển thị danh sách sau khi sắp xếp giảm dần :");
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
    }
}
