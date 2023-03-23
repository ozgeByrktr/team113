package day28_Deneme;

import day28_accessModifier.C03_EncapsuleDatalar;

public class EncapsulationKullanimi {
    public static void main(String[] args) {

        System.out.println(C03_EncapsuleDatalar.getIsim());
        C03_EncapsuleDatalar obj= new C03_EncapsuleDatalar();
        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);
        System.out.println("toplam satıs: "+obj.getToplamSatis());
    }

}
/*
C03_EncapsuleDatalar classındaki isim variableının degeri
 görülsün ama degistirilmesin
 satisTutari ise deger girilsin ama görülemesin

eger bir variable icin read veya write ozelliklerinin birbirinden ayrilmasi isteniyorsa
öncelikle acces modifier ile kimsenin ulasamamsını saglayin.

    private yaparak kimsenin ulasamayacagını garantiye aldıktan sonra

    * READ yetkisi vermek istediklerimiz icin getter() methodu
    * WRITE yetkisi vermek istediklerimiz icin setter() methodu olusturmalıyız.
 */