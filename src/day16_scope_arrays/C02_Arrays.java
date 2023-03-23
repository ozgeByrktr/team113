package day16_scope_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[] isimler = {"Nurefsan", "Berke", "Mustafa" };
        int[] sayilar = {3, 4, 5, 6, 7, 8, 9, 6, 8, 9};
        char[] karakterler = {'e', '*', '9', 'q'};

        //Array non primitive data turlerindendir
        //Eger lıste seklinde olusturmayıp new keyword kullanıyorsak
        // uzunlugunu yazmak zorundayız

        String[] arr = new String[5];
        /*
        Bir array tanımlanan uzunluktan daha fazla ya da az eleman alamaz.
        bir Array i yazdırmak istersek
        Arraylar direk yazdırılamaz

        */
        System.out.println(isimler);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(arr));//[null, null, null, null, null]

        int[] a = new int[7];
        System.out.println(Arrays.toString(a));//[0, 0, 0, 0, 0, 0, 0]

        //Array'daki elementlere nasil ulaşırız: index ile

        a[0] = 4;
        a[3] = 7;
        //a[7]=8;//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(a));

        // Array'in uzunlugu degistirilmez method da olmaz.

        //sayilar arrayinin 4. indeksindeki elementi yazdırın
        System.out.println(sayilar[4]);//7

        //isimler arrayinin 1. indexi
        System.out.println(isimler[1]);//Berke

    }

}
