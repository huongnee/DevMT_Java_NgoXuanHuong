package ThucHanh;

import java.util.Scanner;

public class BaiThucHanh02 {
    //1.khai báo biến toàn cục là 1 mảng 2 chiều kiểu String
    //Khởi tao mảng với 3 phần tử , viết mã nhập liệu cho mảng

    String arrNhanVien [][] = new String[3][2];
    //3 hàng 2 cột , mỗi hàng là thông tin của 1 ng ví dụ hàng 1 cột 1 tức [0][0] - name vs age
    //cứ cùng 1 hàng thì bao nhiêu cột cũng vẫn là thông tin ve dối tượng hàng 1 đó , kiểu như là thông tin kèm của 1 ng

    public void input()
    {
        for (int i = 0; i < arrNhanVien.length; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ "+(i+1));
            Scanner sc = new Scanner(System.in);
            arrNhanVien[i][0] = sc.nextLine(); // nhập name cho ng 1
            arrNhanVien[i][1] = sc.nextLine(); // nhập age cho ng 1
        }
        System.out.println("Cảm ơn đã nhập liệu ");
    }
    public void sapXep()
    {
        for(int i = 0;i<arrNhanVien.length;i++)
        {
            for(int j = i+1 ; j<arrNhanVien.length ;j++)
            {
               if(Float.parseFloat(arrNhanVien[j][1])<Float.parseFloat(arrNhanVien[i][1]))
               {
                   String temp[][] = new String[1][2];
                   //Dổi chỗ
                   temp[0][0] = arrNhanVien[j][0];
                   temp[0][1] = arrNhanVien[j][1];

                   arrNhanVien[j][0] = arrNhanVien[i][0];
                   arrNhanVien[j][1] = arrNhanVien[i][1];

                   arrNhanVien[i][0] = temp[0][0];
                   arrNhanVien[i][1] = temp[0][1];
               }
            }
        }
    }
    //hiển thị
    public void display()
    {
        for (int i = 0; i < arrNhanVien.length; i++) {
            System.out.println(arrNhanVien[i][0] + "-" + arrNhanVien[i][1]);
        }
    }

    public static void main(String[] args) {

        BaiThucHanh02 obj = new BaiThucHanh02();
        obj.input();
        obj.sapXep();
        obj.display();

    }
}
