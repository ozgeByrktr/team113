package day21_arrayListForEachLoop;

import java.util.Arrays;

public class C05_IstenenHarfAdediniBulma {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle = "Yatin kalkin Java calisin";
        String istenenHarf = "c";
        String[] karakterler = cumle.split("");

        System.out.println(Arrays.toString(karakterler));

        int sayac = 0;
        for (String each : karakterler
        ) {
            if (each.equalsIgnoreCase(istenenHarf)) {
                sayac++;
            }
        }
            if (sayac == 0) {
                System.out.println("istenen harf kullanilmamis");
            } else {
                System.out.println("istenen harf cümlede " + sayac + " kere kullanılmış.");
            }

    }
}
