import java.util.*;

public class Bai2 {
    Set<String> words = new HashSet<String>();

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng");
        n = sc.nextInt();
        Bai2 b = new Bai2();
        b.input(n);
        b.output();
    }
    public void input(int n) {
        System.out.println("Nhập "+n+" thành phố");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Thành phố thứ "+(i+1));
            words.add(sc.next());
        }
    }
    public void output() {
        System.out.println("Danh sách thành pho");
        words.forEach(System.out::println);
    }
    public void sortCity(){
        List<String> list = new ArrayList<String>();
        Collections.sort(list);
        System.out.println("Danh sach thanh pho tang");

    }
}
