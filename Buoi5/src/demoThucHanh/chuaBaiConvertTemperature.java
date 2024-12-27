package demoThucHanh;

import java.util.Scanner;

public class chuaBaiConvertTemperature {
    private float temperNum;
    private float convertC2F(){
        return (float)(temperNum*1.8 + 32) ;
    }
    private float convertF2C(){
        return (float)((temperNum-32) / 1.8) ;
    }

    /**
     *
     * @param nhietDo : Nhiệt độ cần chuyển
     * @param isToC : true- chuyển từ c sang f , false chuyển từ f sang c
     *
     */

    public void convert(float nhietDo , boolean isToC)
    {
        this.temperNum = nhietDo;
        if(isToC==true) {
            float f = convertC2F();
            System.out.println("Độ C sang F"+f);
        }else {
            float f = convertF2C();
            System.out.println("Độ F sang C"+f);
        }

    }
    public static void main(String[] args) {
        chuaBaiConvertTemperature ct = new chuaBaiConvertTemperature();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature :");
        float nhietDo = sc.nextFloat();
        ct.convert(nhietDo,true);
        ct.convert(nhietDo,false);
//        System.out.println(cSangF);
//        System.out.println(fSangC);
    }
}
