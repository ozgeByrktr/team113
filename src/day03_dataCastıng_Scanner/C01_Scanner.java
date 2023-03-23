package day03_dataCastıng_Scanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scan= new Scanner(System.in); //bir scanner bir classbodye yeter
        // ama ne istediğimizi her seferinde tekrar etmeliyiz.
        System.out.println("Lutfen isminizi giriniz");

        String isim= scan.nextLine();

        System.out.println("Lutfen soyisminizi yaziniz");

        String soyisim= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        System.out.println("isminiz : "+ isim);
        System.out.println("soyisminiz : "+ soyisim);
        System.out.println("yasiniz : "+ yas);
        System.out.println ("Kaydiniz basariyla tamamlanmistir");

         // Kullanici istedigimiz data turunde bilgi girisi yapmazsa
        // kodumuzda hata olusur ve calisma durur
        //ileride kullanici hatalarina karsi tedbirler ogrenicez
        // simdilik kullanici biz ne diyorsak onu tam yapiyor kabul edelim
        /* system.out.println de ln yazdırma islemini yaptiktan sonra
        alt satıra gecmesini saglar
        sadece print yazarsak yazdirdigimiz seyler yanyana yazdirilir.
         */
        System.out.println("Isminiz : "+ isim +
                "\nSoyisminiz : "+ soyisim +
                  "\nYasiniz : "+ yas +
                        "\nKaydiniz basariyla tamamlanmistir.");



        //tek bir system.out.println() ile birden fazla satir yazdirmak isterseniz
        //string bir ifadenin icinde istedigimiz yere \n yazabilirsiniz



    }



}
