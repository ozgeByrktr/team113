package day02_dataturleri_SCANNER;

import java.util.Locale;

public class C03_nonprimitiveDATATurleri {

    public static void main(String[] args) {
        String isim="Ali Can";
        String ilkharf="K";
        char ilkharf2='m';
        //tek bir karakter atayacaksak ikisinide kullanabiliriz
        System.out.println(ilkharf.toLowerCase());//k
        System.out.println(ilkharf2);

        //primitive data turundeki veriablellar sadece deger tasiyabilir.
        //nonprimitive data turundeki veriablellarin hem deger hem de methodlri olur.

        String metin="rtyuiuojkhyftdggg;hgvhhjh;hjjkh;jghvbvlkkl" +
                "ddxfgvhhjjh;hgdfxgvjjjlm;sasxxfgfyyun;nbgdryuhm"+
                "ggdttuknjgyutuikj;bfdregv;jnhgfsre;ngfdrehbmnnbvfgg"+
                "ggdszxfcgftfnbj;bfdesdxfdrd;vfdxvvhjhh";

        String not="not";
        String Not="variable isimlerinin buyuk harf ile baslamasi tavsiye edilmez ama java kabul eder";
        String nOT="Bir kere deklare edilen variable tekrar deklare edilemez";
        String noT="ama isimler farkli sekilde yazildigi için java bunlari farkli variable olarak kabul eder.";


        //camelCase:kucuk harfle baslar,sonraki kelimeler bitisik yazılır ve ilk harfi buyuk olur.
        //ilkHarf, ogrenciNo,okulDefteriDolabi
        //naming convention






    }
}
