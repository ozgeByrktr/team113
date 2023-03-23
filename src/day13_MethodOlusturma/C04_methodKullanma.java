package day13_MethodOlusturma;

import java.util.Scanner;

public class C04_methodKullanma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("10'dan kucuk iki adet pozitif tam sayi girin : ");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        int sonuc= C03_Faktoryel.faktoryelHesapla(sayi1)+ C03_Faktoryel.faktoryelHesapla(sayi2);
        System.out.println(sonuc);
    }
}
