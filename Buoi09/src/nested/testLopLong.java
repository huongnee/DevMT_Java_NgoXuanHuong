package nested;

public class testLopLong {
    public static void main(String[] args) {
        lopLong l2 = new lopLong();
        l2.name = "Nguyen";
        l2.sayHello();
        //sử dụng lớp con bên trong
        lopLong.nested n = l2.new nested();
        n.sayGoodBye();
        // lớp chính.tên lớp con var = đối tượng mowi của lớp chính.new class lớp phụ
        lopLong.nested2 n2 = new lopLong().new nested2();
        n2.sayGoodBye1();
    }
}
