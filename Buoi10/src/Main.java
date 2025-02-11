public class Main {
    public static void main(String[] args) {
        String a = "123";
//        int c = (int)a; sai
        int b = Integer.parseInt(a); // Ép kiểu String sang int
        System.out.println(b); // Kết quả: 123

        System.out.println("Hello, World!");
    }
}