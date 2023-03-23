package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C06_IfElseIf {
    public static void main(String[] args) {
         /*
        Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        vucut kitle endeksi
        30’dan buyukse obez,
        25-30 arasi ise kilolu,
        20-25 arasi ise normal,
        20’den kucukse zayif yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu Kg giriniz :");
        double kg= scan.nextDouble();
        System.out.println("Lutfen boyunuzu cm giriniz :");
        double boy= scan.nextDouble();

        double kitleEndeksi= (kg * 10000 / (boy*boy));
        System.out.println("Vucut Kitle Endeksiniz: " + kitleEndeksi);

        if (kg<=0 || boy<=0 || boy>300 || kg>500){
            System.out.println("Yanlis giris yaptiniz, tekrar deneyiniz");

            
        }else if (kitleEndeksi<20) {
        System.out.println("zayif");
    } else if (kitleEndeksi<25) {
        System.out.println("Normal");
    } else if (kitleEndeksi<30) {
        System.out.println("Kilolu");
    }else{
        System.out.println("Obez");
    }















    }
}
