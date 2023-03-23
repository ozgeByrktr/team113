package day11_stringManipulations_ForLoop;

import java.util.Scanner;

public class C07_sifrekontrol {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");

        String sifre = scan.next();

                int flag=0;

                // - ilk harf kucuk harf olmali
                if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
                    flag++;
                }else{
                    System.out.println("ilk karakter kucuk harf olmali");
                }
                // - son karakter rakam olmali
                char sonHarf=sifre.charAt(sifre.length()-1);
                if (sonHarf>='0' && sonHarf<='9'){
                    flag++;
                }else{
                    System.out.println("son karakter rakam olmali");
                }
                // - sifre bosluk icermemeli
                if (sifre.contains(" ")){
                    System.out.println("Sifre bosluk icermemeli");
                }else{
                    flag++;
                }
                // - uzunlugu en az 10 karakter olmali
                if (sifre.length()>=10){
                    flag++;
                }else{
                    System.out.println("Sifrenin uzunlugu en az 10 karakter olmalidir");
                }
                // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
                if (flag==4){
                    System.out.println("sifre basariyla kaydedildi");
                }
            }

}
