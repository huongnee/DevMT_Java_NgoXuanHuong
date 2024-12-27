package demoLyThuyet;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    //thử nạp trồng add
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public int add(float a, float b) {
        return (int)a + (int)b;
    }
    public void add(double a, double b , int c) {

    }
    public void subtract(int a, int b) {
        int res = a-b;
        System.out.printf("\n %d - %d = %d\n", a, b,res);
    }
    public void multiply(int a, int b) {
        int res = a * b;
        System.out.printf("\n %d * %d = %d\n", a, b,res);
    }
    public float divide(int a, int b) {
        if(b!=0)
        {
            return (float)a / b;
        }
        return 0;
    }
    //PassByValue
    public void passByValue(int a)
    {
        a = a + 10;
        System.out.println("In method "+a);
    }


    //test

    public static void main(String[] args) {
        Calculator calc = new Calculator();
//        Circle circle = new Circle();
        int sum = calc.add(1,2);

        System.out.println("Tổng = "+sum);
        calc.subtract(2,3);
        calc.multiply(2,3);
        float div =  calc.divide(5,3);
        System.out.println("Result phép chia : "+div);
        //test passbyvlaue
        int a = 100;
        calc.passByValue(a);
        //sau khi thực hiện test xem a có dổi ko
        System.out.println("Out "+a);

        //Tham chiếu
       calc.calcArea(new Circle(),2);
        //
        calc.addNumber(10,12,15);
        calc.addNumber(100,12,15,11,1111,22);
    }
    // Truyền tham chếu
     public static class Circle{
        public double getPi()
        {
            return 3.14;
        }
    }
    //Phương thức không giới hạn tham số
    public void addNumber(int ...num){
        int total = 0;
        for (int n:num)
        {
            total += n;
        }
        System.out.println("Total = "+total);
    }


        public void calcArea(Circle objPi, double rad){
            double area= objPi.getPi() * rad * rad;
            System.out.println("Area of the circle is "+ area);
        }
}
