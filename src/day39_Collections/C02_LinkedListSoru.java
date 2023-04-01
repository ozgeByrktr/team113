package day39_Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListSoru {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Once list1 i olusturalım");
        List<String>list1=kullanicidanAlarakOlustur();
        System.out.println("Lİst 2 'yi olusturalim");
        List<String>list2=kullanicidanAlarakOlustur();
        list1.retainAll(list2);
        System.out.println("Ortak elementler listesi :"+list1);

    }
    public static List<String>kullanicidanAlarakOlustur(){
        List<String>isimListesi=new LinkedList<>();
        System.out.println("Listeye eklemek için isim giriniz.\n" +
                "Bitirmek için 0'a basınız.");
        String isim="";
        while (!isim.equalsIgnoreCase("0")){
            isim= scan.nextLine();
            if(!isim.equalsIgnoreCase("0")){
                isimListesi.add(isim);
            }
        }
        return isimListesi;
    }
}
