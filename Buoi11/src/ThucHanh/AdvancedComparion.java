package ThucHanh;

public class AdvancedComparion <T extends Comparable<T> > {
    public void maximum(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        System.out.println("Maximum is " + max);
    }

    public static void main(String[] args) {
        AdvancedComparion <Integer> a = new AdvancedComparion <Integer>();
        AdvancedComparion <Float> b = new AdvancedComparion <Float>();
        AdvancedComparion <String> c = new AdvancedComparion <String>();

        a.maximum(1,6,3);
        b.maximum(2.3f,2.1f,2.2f);
        c.maximum("hhe","ok","q");


    }
}
