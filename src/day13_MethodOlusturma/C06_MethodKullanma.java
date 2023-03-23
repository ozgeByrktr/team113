package day13_MethodOlusturma;

import java.util.Scanner;

public class C06_MethodKullanma {
    public static void main(String[] args) {
        //Verilen bir String'in Palindrom olup olmadıgını yazdırın.
        // duzden ve tersten aynı sekilde yazılan=Palindrome
        //madam ,12321,kabak

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin= scan.nextLine();

        String tersmetin = C05_StringiTerseCevirme.stringTersineCevir(metin);
        if (metin.equals(tersmetin)){
            System.out.println("Girilen metin Palindrom");
        }else{
            System.out.println("Girilen metin Palindrom degil");
        }
    }

}
