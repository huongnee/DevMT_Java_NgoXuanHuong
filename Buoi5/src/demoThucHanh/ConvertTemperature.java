package demoThucHanh;

import java.util.Scanner;

public class ConvertTemperature {
    private float temperNum;
    private float convertC2F(float temperNum){
        return (temperNum*1.8f) + 32 ;
    }
    private float convertF2C(float temperNum){
        return (temperNum-32) / 1.8f ;
    }
    public float convert(float nhietDo , boolean isToC)
    {
        if(isToC)
            return convertC2F(nhietDo);
        return convertF2C(nhietDo);
    }

    public static void main(String[] args) {
        ConvertTemperature ct = new ConvertTemperature();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature :");
        float nhietDo = sc.nextFloat();
        float cSangF = ct.convert(nhietDo,true);
        float fSangC = ct.convert(nhietDo,false);
        System.out.println(cSangF);
        System.out.println(fSangC);
    }

}
