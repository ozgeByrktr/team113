package day44_EntryMap;

import day40_Maps.MapMethodDepo;

import java.util.Map;

public class C02_entrySet {
    public static void main(String[] args) {

        // verilen okulMap'indeki soyisimleri buyuk harfe cevirin.

        Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        okulMap = MapMethodDepo.soyisimleriBuyukYap(okulMap);
        System.out.println(okulMap);
    }
}
