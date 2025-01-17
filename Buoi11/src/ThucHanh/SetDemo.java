package ThucHanh;

import java.util.Arrays;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        int [] count = {10,55,3,322,422};
        System.out.println("Original Array: "+ Arrays.toString(count));

        TreeSet sortedSet = new TreeSet<Integer>();
        for (int i = 0; i < 5; i++) {
            sortedSet.add(count[i]);
        }
        System.out.println("SortedSet: "+ sortedSet);

        System.out.println("The First Element: "+ (Integer)sortedSet.first());

        System.out.println("The Last Element: "+ (Integer)sortedSet.last());

    }
}
