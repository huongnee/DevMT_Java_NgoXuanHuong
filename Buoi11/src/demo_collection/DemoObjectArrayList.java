package demo_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoObjectArrayList {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        //thêm sv
        list.add(new Student(1,"A1",20));
        list.add(new Student(2,"A2",30));
        list.add(new Student(3,"A3",40));

        //Cập nhật
        list.set(0,new Student(10,"ok",2));

        //In
        for(Student student : list){
            System.out.println(student.toString());
        }

        //sắp xếp
    }
}

