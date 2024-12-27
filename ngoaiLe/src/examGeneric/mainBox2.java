package examGeneric;

import javax.swing.*;

public class mainBox2  {
    public static void main(String[] args) {
        
        box2 box = new box2<Integer>(15);
//        box.value1 = 1;
        System.out.println(box.getValue());
        box2 box2 = new box2<String>("Hello World");
        System.out.println(box2.getValue());
        box2 box3 = new box2<Double>(15.6);
        System.out.println(box3.getValue());

    }
}
