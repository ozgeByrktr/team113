package day18_multiDimensionalArray;

import java.util.Arrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {
        //Bir Stringi istediğimiz parcalara ayırmak icin kullanilir
        String str = "Java candir can, bundan suphesi olan var mi?";
        //str kac kelimedir?

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[Java, candir, can]

        System.out.println("kelime sayisi: " + kelimeler.length);

        //en uzun kelime kac harflidir?
        int enUzunKelimeLength = kelimeler[0].length();

        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].length() > enUzunKelimeLength) {
                enUzunKelimeLength = kelimeler[i].length();
            }
        }

        //bir String'i karakterlerine ayırmak istersek:

        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));
        System.out.println("Cumledeki karakterler sayisi: " + karakterler.length);


    }
}
