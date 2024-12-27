package mang1chieu;

/**
 * Mảng 1 chiều:
 * 1.Khai báo:
 *              datatype[] varname;
 *              datatype[] varname = new datatype[size];
 *              datatype[] varname = {value1,value2...};
 * 2.Nhập xuất
 * 3.1 số thao tác (Sắp xếp, tìm kiếm , thêm, sửa, xóa ...)
 */
public class demo {
    public static void main(String[] args) {
        //Mảng 1 chiều
        //1.Khai báo , khởi tạo
        int[] arrInt;//khai báo biến mảng
        arrInt = new int[10];//sau khi khai báo thi khoi tạo nó

        //2, Nhập/xuát: nameBienMang[index]
        //Nhập
        arrInt[0] = 100;
        arrInt[6] = 500;
        arrInt[9] = 200;
        //Xuát
        System.out.println(arrInt[0]);
        System.out.println(arrInt[6]);
        System.out.println(arrInt[9]);
        //Duyệt mảng
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("-----------------------");
//            System.out.println(arrInt[i]);
            System.out.printf("\n arrInt[%d] = %d\n", i, arrInt[i]);
        }
        //Dùng for each
        for(var item : arrInt) {
            System.out.printf("\n item = %d\n", item);
        }
        //Khai báo và khởi tạo
        String[] names ={"Hehe","No","Noname"};
        //Duyệt
        for(var item1 : names) {
            System.out.printf("\n item = %s\n", item1);
        }

        //Gán giá trị có mảng arrint vs các giá trị ngẫu nhiên có 2 số
        System.out.println(Math.random());
        for (int i = 0; i < arrInt.length; i++) {
            int num = (int)((Math.random()*89)+10);
            arrInt[i] = num;
        }
        System.out.println("Danh sach phần tử");
        for (var item : arrInt) {
            System.out.printf("\n item = %d\n", item);
        };
    }
}
