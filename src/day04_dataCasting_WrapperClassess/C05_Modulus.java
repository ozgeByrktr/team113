package day04_dataCasting_WrapperClassess;

import java.util.Scanner;

public class C05_Modulus {
    public static void main(String[] args) {

// 3 basamakli bir sayi alin ve sayinin rakamlar toplamini yazdirin

    Scanner scan=new Scanner(System.in);
    System.out.println("Lutfen 3 basamakli pozitif bir sayi giriniz.");

    int girilensayi= scan.nextInt();//135
        int rakam=girilensayi % 10;

       int rakamlartoplami=rakam;
        //========

        girilensayi=girilensayi/10;// 13
        rakam=girilensayi % 10;
        rakamlartoplami=rakamlartoplami+rakam;
        //========
        girilensayi=girilensayi/10;//1

        rakam=girilensayi%10;
        rakamlartoplami=rakamlartoplami+rakam;
        System.out.println("Girilen sayinin rakamlar toplami: "+rakamlartoplami);





    }
}
