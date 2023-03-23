package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);

        harfler.remove("B");//object verirsek boolean sonuc dondurur
        System.out.println(harfler);//true
        System.out.println(harfler.remove(0));//String getirir ,silineni
        System.out.println(harfler);//[K]

        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);

        System.out.println(sayilar);//[1,3,18,2]
        /*
        eger sadece sayılardan olusan bir List varsa remove methoduna
        yazacagımız sayıyı index olarak kabul eder.obje kabul etmez

        Eger sayıyı silmek isterseniz remove methodundan önce
         o sayıyı bir objeye atayıp remove methodunda obje ismini yazabiliriz
         */
        System.out.println(sayilar.remove(3));//3.index silinir
        sayilar.remove(0);//1'i siler

        //3'ü silelim
        Integer silinecekSayi= 3;
        sayilar.remove(silinecekSayi);
        System.out.println(sayilar);//[18]


    }
}
