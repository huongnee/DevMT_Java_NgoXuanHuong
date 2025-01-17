package demo_collection;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        List<String> list1 = new ArrayList<String>();

        System.out.println("Size of list "+list.size());

        //
        list.add("1");
        list.add("2");
        System.out.println("Size of list "+list.size());
        list.add("3");
        System.out.println("Size of list "+list.size());

        System.out.println("Các phần tu là: ");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("_______________________________");
        //Đặt lại - thay thế giá trị tại vị trí nào đấy
        list.set(0, "4");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
