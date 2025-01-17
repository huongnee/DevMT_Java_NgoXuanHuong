package ThucHanh;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> students = new HashMap<String,String>();

        students.put("K1","ok");
        students.put("K2","ok1");
        students.put("K3","ok2");

        for (Map.Entry<String,String> entry : students.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" = "+value);
        }

        System.out.println("Stu = K1 "+students.get("K1"));

        //xóa sinh viên k2
        students.remove("K2");
        System.out.println("After students "+students);
    }
}
