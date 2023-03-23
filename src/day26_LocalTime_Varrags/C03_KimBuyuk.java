package day26_LocalTime_Varrags;

import java.time.LocalDate;
import java.util.Scanner;

public class C03_KimBuyuk {
    public static void main(String[] args) {
        //kullanicidan 2 farkli kişinin isim ve dogum tarihinin gün ay ve yılını alıp
        // hangi tarihte dogan kişinin daha buyuk oldugunu yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");
        String isim1= scan.nextLine();
        System.out.println("Lutfen 2. kişinin ismini giriniz: ");
        String isim2= scan.nextLine();
        System.out.println("Dogum tarihinizi gun ay yıl olarak giriniz: ");
        int gun= scan.nextInt();
        int ay= scan.nextInt();
        int yil= scan.nextInt();
        LocalDate tarih1=LocalDate.of(yil,ay,gun);
        System.out.println("Dogum tarihinizi gun ay yıl olarak giriniz: ");
        int gun2= scan.nextInt();
        int ay2= scan.nextInt();
        int yil2= scan.nextInt();
        LocalDate tarih2=LocalDate.of(yil2,ay2,gun2);

        System.out.println(tarih2.isAfter(tarih1) ?
                "Buyuk olan isim1": "Buyuk olan isim2");

    }
}
