package examGeneric;

public class box2 <T>{
    private T value;
    protected int value1;
//    public  int value1;
    public box2(){}
    public box2(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
}
