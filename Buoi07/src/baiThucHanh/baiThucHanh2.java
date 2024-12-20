package baiThucHanh;
//Lưu ý class trùng vs tên file phải là public còn các class thì ko đc là public
class NhanVien{
    String name;
    static int count; //để static thì nó sẽ chia sẻ vs tất cả nên khi chạy tất cả đều ra kết quả là 3 vì nó chia sẻ
}

/**
 * name : nhanVienMain = baiThucHanh2
 */
public class baiThucHanh2 {
    public static void main(String[] args) {
        NhanVien [] nv = new NhanVien[3];
        //NV1
        nv[0] = new NhanVien();
        nv[0].name = "Hehe";
        nv[0].count++;
        //NV2
        nv[1] = new NhanVien();
        nv[1].name = "Huong";
        nv[1].count++;
        //NV3
        nv[2] = new NhanVien();
        nv[2].name = "Theo";
        nv[2].count++;

        //in
        System.out.println("List : ");
        for(NhanVien nvi : nv){
            System.out.println(nvi.name + " " + nvi.count);
        }
    }
}
