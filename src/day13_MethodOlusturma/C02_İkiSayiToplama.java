package day13_MethodOlusturma;

import java.util.Scanner;

public class C02_İkiSayiToplama {
    public static void main(String[] args) {

        //Yazdıran method
        //Kullanicidan iki sayi alıp toplamlarini yazdiran bir method olusturun.





        ikiSayiTopla();
    }
    public static void ikiSayiTopla(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Toplamak uzere iki sayi giriniz: ");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("İki sayinin toplami : "+ (sayi1+sayi2));

    }

}
