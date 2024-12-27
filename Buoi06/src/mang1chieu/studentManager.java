package mang1chieu;


import java.util.Scanner;

/**
 * Khởi tạo mảng student gồm 100 phần tử
 * Nhập số sinh viên n
 * Nhập n thông tin sinh viên
 * In ra màn hình n thông tin sinh viên
 * Sắp xếp danh sách sinh viên theo tuổi giảm dần
 */
public class studentManager
{
    //1.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên muốn nhập");
        int n = sc.nextInt();
        student[] sv = new student[n];

        //nhập từng sinh viên
        for (int i = 0; i < sv.length; i++){
            System.out.println("Thông tin sinh viên thứ "+i);
            sv[i] = new student();
            sv[i].id = sc.nextInt();
            sv[i].name = sc.next();
            sv[i].age = sc.nextInt();
        }
        //in ra danh sách
        for (int i = 0; i < sv.length; i++){
            System.out.println(sv[i].toString());        }
        //sắp xếp
        student tmp;
        for(int i = 0;i<sv.length-1;i++)
        {
            for(int j = i+1 ; j<sv.length ;j++)
            {
                if(sv[i].age>sv[j].age)
                {
                    tmp = sv[i];
                    sv[i]=sv[j];
                    sv[j]=tmp;
                }
            }
        }
        System.out.println("Danh sách sinh viên theo age tăng dần là : ");
        for(int i = 0;i<sv.length;i++)
        {
            System.out.print("\t"+sv[i]+"\n");
        }
        //Sinh viên có tuổi lớn nhất là
        student maxAge = sv[0];
        for(int i = 0;i<sv.length;i++)
        {
            if(maxAge.age < sv[i].age)
            {
                maxAge = sv[i];
            }
        }
        System.out.println("Sinh viên có tuổi lớn nhất là : "+maxAge.name);

    }
}
