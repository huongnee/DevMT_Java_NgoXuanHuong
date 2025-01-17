package ThucHanh;

public class MyGenerics <T> {
    private T t;
    public MyGenerics(T t) {}
    public MyGenerics() {}
    public T getT() { return t; }
    public void setT(T t) { this.t = t; }

    public static void main(String[] args) {
        //Khai báo tạo mới
        MyGenerics <String> myGenerics = new MyGenerics<String>();
        MyGenerics <Integer> myGenerics1 = new MyGenerics<Integer>();

        //Đặt-gán
        myGenerics.setT("a");
        myGenerics1.setT(1);

        //in
        System.out.println(myGenerics.getT());
        System.out.println(myGenerics1.getT());
    }
}
