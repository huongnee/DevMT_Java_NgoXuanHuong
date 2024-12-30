package lab09.baiThucHanh1;

public class MainTest {
    public void pheptinh(ITinhToan pheptinh , float num1 , float num2){
        pheptinh.doOperation(num1 , num2);
    }
    public static void main(String[] args) {
        MainTest mainTest = new MainTest();

        //cộng
        ImplOperationAdd implAdd = new ImplOperationAdd();
        implAdd.setAccuracy(IAccuracy.TWO_NUMBER);
        mainTest.pheptinh(implAdd , 1 , 2);
        //Nhân
        ImplOperationMultiply implMul = new ImplOperationMultiply();
        implMul.setAccuracy(IAccuracy.THREE_NUMBER);
        mainTest.pheptinh(implMul,5,3);
        //Trừ
        ImplOperationSubtract implSub = new ImplOperationSubtract();
        implSub.setAccuracy(IAccuracy.FOUR_NUMBER);
        mainTest.pheptinh(implSub,10,3);
    }
}
