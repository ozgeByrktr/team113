package day04_dataCasting_WrapperClassess;

public class C03_DataCasting {
    public static void main(String[] args) {

        int a=20;
        int b=6;
        System.out.println(a/b);//3

      double c=6;
        System.out.println(a/c);//3.3333333335

        float d= 6f;
        System.out.println(a/d);//3.333333

        //a/b isleminin sonucunu ondalikli olarak yazdiriniz

        System.out.println((double) (a/b));//3.0
        //islem onceligi (a/b) 'dedir.
        // sonra double oldugundan 3'ü double'a cast eder 3.0 bulur.
        // işleme girilenlerden birisi double olmalıdır.

        System.out.println((double)a/b);//3.3333333333333335

        System.out.println(a/(double)b);//3.3333333333333335
        int e=1467;
        System.out.println(e=e/10);//146
        System.out.println(e);//146

        e=e/10;
        System.out.println(e);//14
        e=e/10;
        System.out.println(e);//1
        e=e/10;
        System.out.println(e);//0









    }
}
