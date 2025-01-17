package demo_generic;
//public class Demo <T>{}
public class DemoGenericMethod {
    public static <T> void printArray(T[] array) {
        for(T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        printArray(doubleArray);

        String[] stringArray = {"a", "b", "c"};
        printArray(stringArray);

        Character[] charArray = {'a', 'b', 'c'};
        printArray(charArray);
    }
}
