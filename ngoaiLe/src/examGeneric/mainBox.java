package examGeneric;

import javax.swing.*;

public class mainBox {
    public static void main(String[] args) {
        Box box = new Box(15); // đúng với kiểu int
       //  Box box2 = new Box(15.5); // sai vì kdl chi dc la int
        //  Box box3 = new Box("haha"); // sai vì kdl chi dc la int
         // --> giải pháp dùng generic , xem ở box2
    }
}
