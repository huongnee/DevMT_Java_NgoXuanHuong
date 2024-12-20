package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        students.add(new Student(1,"hehe",20));
        System.out.println("Nhập thông tin : ");
        //
        int msv = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int age = sc.nextInt();
        students.add(new Student(msv,name,age));
        System.out.println(students.toString());

        Collections.sort(students,(a,b)->{return a.getAge()-b.getAge();}); // sap xếp tăng
        System.out.println("Tăng");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i+1)+" "+students.get(i));
        }
    }
}
