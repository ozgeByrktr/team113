package day29_Inheritance;

public class C02_EncapsulationKullanim {
    public static void main(String[] args) {

        C01_inheritance obj=new C01_inheritance();
         obj.isim="Melike";//Write
        System.out.println(obj.isim);//read

        obj.setSayi(40); //write
        System.out.println(obj.getSayi());//read
        /*
        Bir class üyesinin public olması ile private yapılıp getter ve setter methodlarinin
        olusturulmasi islevsel acıdan aynı sonucu olusturur.

        Bazi developerlar set ve get yetkilerinin kullanildigini vurgulamak için 2. yöntemi tercih ederler.

         */



    }
}
