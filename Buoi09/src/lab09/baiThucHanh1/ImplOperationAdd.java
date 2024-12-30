package lab09.baiThucHanh1;

public class ImplOperationAdd implements ITinhToan ,IAccuracy{

    private int accuracy;

    //set xem lay may dau sau dau phay
    @Override
    public void setAccuracy(int accuracy) {

    }
    //tinh toan
    @Override
    public void doOperation(float num1, float num2) {
        System.out.printf("\n");
        System.out.printf("Result Add = %."+accuracy+"f",(num1 + num2));
    }

    public static void main(String[] args) {
        ImplOperationAdd impl = new ImplOperationAdd();
        impl.setAccuracy(4);
        impl.doOperation(1, 2);
    }

}
