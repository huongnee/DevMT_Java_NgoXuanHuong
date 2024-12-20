package review;

/**
 * Array
 */

public class test {
    public static void main(String[] args) {
        //khởi tạo biến mảng
        Student [] sv = new Student[3];
        //thêm giá trị vào mảng
        sv[0] = new Student(1,"sv1",22);
        sv[1] = new Student(2,"sv2",33);
        sv[2] = new Student(3,"sv3",44);
        sv[9] = new Student(9,"sv9",55);

        //in danh sách
        //lưu ý foreach ko đc để trống kiểu từ 1-9 mà chỉ có giá trị 1-7 xong đến 9 mà bỏ qua 8 null là chạy đến đó lỗi
        for(Student list : sv)
        {
            if(list != null) //thêm cái nay để tránh lỗi null vs foreach
                System.out.println(list.toString());
        }

    }
}
