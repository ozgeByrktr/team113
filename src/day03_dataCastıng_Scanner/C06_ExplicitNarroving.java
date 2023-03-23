package day03_dataCastıng_Scanner;

public class C06_ExplicitNarroving {
    public static void main(String[] args) {
        double db1= 45.32;

       // int in1= db1;//int<==double

        int in1= (int)db1;

        System.out.println(in1);//45 ondalikli kısmı atar

        db1=3987876765d;
        in1=(int)db1;//int<double
        System.out.println(in1);//2147483647

        in1=34;

        byte by1=(byte)in1;
        System.out.println(by1);//34

        in1=130;
         by1=(byte)in1;
        System.out.println(by1);//-126

        in1=256;
        by1=(byte)in1;
        System.out.println(by1);//0 her 256 da bir sıfırlanır.







    }
}
