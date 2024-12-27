package arrayList;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println(list.size());//ddau tien la 0
        list.add(10);
        list.add(20);
        list.add("hehe");
        System.out.println(list.size()); // lúc này sẽ là 3 , ko kể kdl nếu dùng arraylist
        printArrayList(list);//cách 1 kết hợp vs hàm dưới
        list.stream().forEach(System.out::println);// cách 2 ko cần hàm dưới chỉ cần lệnh này
    }
    static void printArrayList(ArrayList list) {
        System.out.println("Danh sách");
        for(var listne:list)
        {
            System.out.println(listne);
        }
    }

}
