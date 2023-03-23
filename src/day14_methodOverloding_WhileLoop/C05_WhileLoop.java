package day14_methodOverloding_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        //Kullanicidan toplanmak uzere sayilar alın
        //toplam 500'ü asınca
        //kac sayi girdigini ve sayilarin toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        int girilensayi=0;
        int toplam=0;
        int girilensayiAdedi=0;

        while (toplam<500) {

            System.out.println("Lutfen toplanmak uzere bir tam sayi giriniz : ");

            girilensayi= scan.nextInt();

            toplam += girilensayi;
            girilensayiAdedi++;

        }
        System.out.println("toplam "+girilensayiAdedi +" adet sayi girildi ve toplami : "+toplam);


    }
}
