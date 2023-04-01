package day39_Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C03_LinkedListSoru {
    static Scanner scan = new Scanner(System.in);
    static List<Double> notListesi = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("Oncelikle ogrenci not listesi olusturalım");
        notListesineDegerEkle();
        System.out.println(notListesi);
        double notOrtalamasi;
        double notToplam = 0;
        int ortAltiOgrSayisi = 0;
        int ort10AltUst = 0;
        for (Double eachNot : notListesi
        ) {
            notToplam += eachNot;
        }
        notOrtalamasi = notToplam / notListesi.size();
        for (Double eachNot : notListesi
        ) {
            if (eachNot < notOrtalamasi) {
                ortAltiOgrSayisi += 1;
            }
            if (eachNot > notOrtalamasi - 10 && eachNot <= notOrtalamasi + 10) {
                ort10AltUst += 1;
            }

        }
        System.out.println("Not Ortalaması: " + notOrtalamasi);
        System.out.println("Ogrenci sayisi: " + notListesi.size() +
                "\nortalama altı ogr sayısı: " + ortAltiOgrSayisi + "\n" +
                "Ortalamanın 10 puan altı ustu ogr sayisi: " + ort10AltUst);
    }

    public static void notListesineDegerEkle() {
        double not;
        boolean loopDevam = true;

        while (loopDevam) {
            try {
                System.out.println("Lutfen ogrenci notlarini giriniz \n" +
                        "Bitirmek icin Q'ya basınız.");
                not = scan.nextDouble();
                notListesi.add(not);
            } catch (Exception e) {
                String girilenDeger = scan.nextLine();
                if (girilenDeger.equalsIgnoreCase("Q")) {
                    loopDevam = false;
                    break;
                } else {
                    System.out.println("Not icin sayısal degerler girmelisiniz.");
                }
            }
        }
    }
}
