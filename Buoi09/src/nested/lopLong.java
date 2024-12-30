package nested;

public class lopLong {
    String name;
    int age;
    public lopLong(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello() {
        System.out.println("Hello " + name);
    }
    public lopLong() {}

    //Lớp con bên trong gọi là nested
    //inner class , nếu static thì sang bên kia gọi đơn giản hơn
    class nested {
        public void sayGoodBye() {
            System.out.println("Goodbye " + name);
        }
    }

    class nested2 {
        public void sayGoodBye1() {
            System.out.println("Ok");
        }
    }
}
