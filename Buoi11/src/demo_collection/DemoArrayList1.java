package demo_collection;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        printArrayList(list);
    }
    public static <E> void printArrayList(List <E> arr) {
        System.out.println("Danh sách ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i)+" ");
        }
    }
}
