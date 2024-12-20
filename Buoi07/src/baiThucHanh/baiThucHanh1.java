package baiThucHanh;

public class baiThucHanh1 {
    final float PI = 3.14f;

    void display(float pi)
    {
     //PI = pi;//ko thể gán vs bieens final
     System.out.println("PI = " + PI);
    }
    public static void main(String[] args) {
        baiThucHanh1 obj = new baiThucHanh1();
        obj.display(10f);
    }
}
