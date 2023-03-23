package day20_ArrayLısts;

import java.util.ArrayList;
import java.util.List;

public class C06_BaskaClasstanCagırma {
    public static void main(String[] args) {
        // C05'deki istenmeyenleri sil methodunu buradan kullanalim

        List<String>urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Cikolatali Gofret");
        urunler.add("Cokoprens");
        urunler.add("Cokomel");

        String istenmeyenHarf="o";
        System.out.println(C05_IstenmeyeniSil.istenmeyenHarfIcereleriSil(urunler,istenmeyenHarf));
        System.out.println(C05_IstenmeyeniSil.istenmeyenHarfIcereleriSil(urunler,"a"));
    }
}
