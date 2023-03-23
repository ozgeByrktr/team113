package day20_ArrayLısts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_IstenmeyeniSil {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir listede
        //        istenmeyen harf iceren elementleri silip,
        //        kalan kismini list olarak bize donduren bir method olusturun

        List<String> liste= C04_KullaniciyaListeOlusturtmak.kullaniciyaListOlusturtma();
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kullanilmasini istemediginiz bir harf girin: ");
        String istenmeyenHarf= scan.next().substring(0,1);

        List<String> ayiklanmisList=istenmeyenHarfIcereleriSil(liste,istenmeyenHarf);
    }

    public static List<String> istenmeyenHarfIcereleriSil(List<String> liste, String istenmeyenHarf) {
        //ForLoop le elementleri ele alirken remove yaparsak list uzunlugu degisecegi icin sorun yasarız
        // farklı bir list olusturup,silinmeyecekleri yeni listeye kaydedelim

            List<String>kalanlar=new ArrayList<>();

        for (int i = 0; i < liste.size() ; i++) {
          if(!liste.get(i).contains(istenmeyenHarf)){
              kalanlar.add(liste.get(i));
          }


        }
        return kalanlar;
    }



    }

