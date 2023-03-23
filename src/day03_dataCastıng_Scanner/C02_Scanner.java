package day03_dataCastıng_Scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        /*Soru 5- Kullanicidan ismini, soyismini
        ve yasini alip asagidaki formatta yazdirin.
        girilen bilgiler : J Doe, 44
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi,soyisminizi ve yasinizi giriniz"
                +"\nHerbilgiden sonra ENTER'a basiniz");
        char isimilkharf= scan.nextLine().charAt(0);
        String soyisim= scan.nextLine();
        double yas= scan.nextDouble();

        System.out.println("Girilen bilgiler : "+ isimilkharf +" "+soyisim+", "+ yas);





    }
}
