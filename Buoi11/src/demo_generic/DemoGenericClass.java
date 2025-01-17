package demo_generic;

public class DemoGenericClass <T>{
    private T msv;

    public T getMsv() {
        return msv;
    }

    public void setMsv(T msv) {
        this.msv = msv;
    }

    public static void main(String[] args) {
        DemoGenericClass <String> demoGenericClass = new DemoGenericClass <String>();
        demoGenericClass.setMsv("Hello World");
        System.out.println(demoGenericClass.getMsv());

        DemoGenericClass <Integer> demoGenericClass2 = new DemoGenericClass <Integer>();
        demoGenericClass2.setMsv(1);
        System.out.println(demoGenericClass2.getMsv());
    }
}
