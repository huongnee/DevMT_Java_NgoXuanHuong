package ThucHanh;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    List<String> list = new ArrayList<String>();

    //Hàm nhập
    public void testList(){
        list.add("MTH");
        list.add("MY");
        list.add("MY");
        list.add("MY1");
        System.out.println("Danh sách sinh viên : ");
        System.out.print("\t" + list + "\n");

    }
    //Hàm sửa
    public void updateList(){
        list.set(0, "MTH nè");
        System.out.println("Danh sách sinh viên sau khi update : ");
        System.out.print("\t" + list + "\n");
    }

    //Hàm xóa
    public void deleteList(){
        list.remove(1);
        System.out.println("Danh sách sinh viên sau khi xoa : ");
        System.out.print("\t" + list + "\n");
    }

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        sm.testList();
        sm.updateList();
        sm.deleteList();
    }
}
