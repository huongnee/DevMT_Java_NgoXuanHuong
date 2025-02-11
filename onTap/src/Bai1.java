import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    List<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng");
        n = sc.nextInt();
        Bai1 b = new Bai1();
        b.input(n);
        b.output();
        b.sortAsc();
        b.output();
    }
    public void input(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử thứ ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ "+(i+1));
            list.add(sc.nextInt());
        }
    }
    public void output() {
        System.out.println("List");
        list.forEach(System.out::println);
    }
    public void sortAsc(){
        Collections.sort(list);
    }
}
