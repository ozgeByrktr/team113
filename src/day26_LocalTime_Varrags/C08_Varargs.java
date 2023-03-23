package day26_LocalTime_Varrags;

import java.util.Arrays;

public class C08_Varargs {
    public static void main(String[] args) {
        topla(3, 4);
        topla(3, 4, 5);
        topla(3, 4, 5, 6);
        topla(1, 2, 4, 5, 7, 8);
        topla(3,5,7,9,4,6,1,5,8);
    }

    public static void topla(int... a) {
        System.out.println(Arrays.toString(a));
        int toplam=0;
        for (int each:a
             ) {
            toplam+=each;
        }
        System.out.println("Toplam : "+toplam);
    }
    /*
    Javada bir method uygun argumentlerine sahip method call oldugunda calısır.
    2 int parametre varsa method call yapıldıgında calısır.
    java aynı data turune sahip olmak sartıyla parametre sayısını esnek tutabilmek icin varargs olusturmustur.
    Varargs bir array dir.
    dolayısıyla methodda array elementlerini istedigimiz isleme uygun olarak kullanabiliriz.

     */
}
