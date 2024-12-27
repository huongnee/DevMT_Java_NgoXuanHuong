package arrayList;

public class demoStringBuilder {
    public static void main(String[] args) {
        // Tạo một đối tượng StringBuilder với chuỗi ban đầu
        StringBuilder sb = new StringBuilder("Hello");

        // Nối thêm chuỗi vào cuối
        sb.append(" World");
        System.out.println("Sau khi nối chuỗi: " + sb);

        // Chèn chuỗi vào vị trí chỉ định
        sb.insert(6, "Java ");
        System.out.println("Sau khi chèn chuỗi: " + sb);

        // Thay thế một phần của chuỗi
        sb.replace(6, 10, "Tuyệt vời");
        System.out.println("Sau khi thay thế: " + sb);

        // Xóa một phần của chuỗi
        sb.delete(6, 15);

        System.out.println("Sau khi xóa: " + sb);

        // Đảo ngược chuỗi
        sb.reverse();
        System.out.println("Sau khi đảo ngược: " + sb);

        // Lấy độ dài của chuỗi
        System.out.println("Độ dài chuỗi: " + sb.length());
    }

}



