package day15_WhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //Kullanıcıdan kodlanmak uzere sayılar alın
        //kullanıcıya bitirmek icin 0'a basmasını soyleyin
        // kullanıcı 0'a bastıgında
        // 0 haric kac sayi girildigini ve toplamlarini yazdirin

        Scanner scan=new Scanner(System.in);

        int girilenSayi=1;
        int toplam=0;
        int sayiAdedi=0;

        /*
        while (girilenSayi!=0){

            System.out.println("Toplamak uzere tamsayi giriniz"+
                    "\nBitirmek icin 0'a basiniz");
            girilenSayi= scan.nextInt();
            if (girilenSayi!=0){
                toplam+=girilenSayi;
                sayiAdedi++;
            }
        }
        System.out.println("Girilen "+sayiAdedi+" Adet sayisinin toplami: "+ toplam);

         */
        do {
            System.out.println("Toplanmak uzere tamsayi giriniz" +
                    "\nBitirmek icin 0'a basiniz");
            girilenSayi = scan.nextInt();
            if (girilenSayi!=0){
                toplam += girilenSayi;
                sayiAdedi++;
            }
        }while(girilenSayi !=0);
        System.out.println("Girilen " + sayiAdedi + " adet sayinin toplami : " + toplam);
    }
}
