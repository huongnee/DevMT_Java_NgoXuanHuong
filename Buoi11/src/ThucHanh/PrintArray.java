package ThucHanh;

import java.util.ArrayList;

public class PrintArray {
    public static <E> void printArray(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static <E> void printArray1(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        String[] strArr = {"A","B","C","D","E","F"};

        printArray(arr);
        printArray(strArr);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(22);
        printArray1(list);
    }
}
