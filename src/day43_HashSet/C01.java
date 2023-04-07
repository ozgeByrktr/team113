package day43_HashSet;

import java.util.Set;
import java.util.TreeSet;

public class C01 {
    public static void main(String[] args) {
        //Set unique bakıyor
        //Set index yapısını desteklemez

        Set<String> ogrenciler=new TreeSet<>();
        ogrenciler.add("Emre");
        ogrenciler.add("Kerem");
        ogrenciler.add("Duygu");
        ogrenciler.add("Burcu");

        System.out.println(ogrenciler);//[Burcu, Duygu, Emre, Kerem]
        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler);//[Ahmet, Burcu, Duygu, Emre, Kerem]
        ogrenciler.add("Kerem");
        System.out.println(ogrenciler);//[Ahmet, Burcu, Duygu, Emre, Kerem]

    }
}
