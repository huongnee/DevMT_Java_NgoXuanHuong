package ThucHanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiThucHanh03 {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    public void test()
    {
        list.add("JAVA");
        list.add("C");
        list.add("C++");
        list.add("C#");
        list.add("PHP");
        list.add(sc.nextLine());
        //in ds
        System.out.println("Danh sách khi chưa sắp xếp : ");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println((i+1)+" "+s);
        }
        //sắp xêp
        Collections.sort(list);
        System.out.println("Danh sách sau khi sắp xếp ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1)+" "+list.get(i));
        }
        //dao ngươc
//        Collections.reverse(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sau khi đảo ngược");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1)+" "+list.get(i));
        }
        //Sắp xếp tăng vs lamda
        Collections.sort(list,(s1,s2) -> s1.compareTo(s2));
        System.out.println("Tăng");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1)+" "+list.get(i));
        }
        //Sắp xếp giảm vs lamda
        Collections.sort(list,(s1,s2) -> s2.compareTo(s1));
        System.out.println("Giam");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1)+" "+list.get(i));
        }

    }

    public static void main(String[] args) {
        BaiThucHanh03 b = new BaiThucHanh03();
        b.test();
    }


}
