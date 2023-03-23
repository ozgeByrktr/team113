package day23_constructor;

public class C03_StaticKeyword {
    static String hastaneismi="Yildiz Hastanesi";
    static String hastanetelefonu="3122343434";
    static String bashekim="Kemal Aydin";

    String persIsmi;
    String perAdresi;
    String perTelefonu;

    public static void main(String[] args) {
        C03_StaticKeyword personel1=new C03_StaticKeyword();
        /*
        1-static variablelar tum claslar icin gecerlidir.
        2-static variabller tum objeler icin ayni degeri tasıdıgından her obje icin ayrıca olusturulmaz,sadece 1 variable olur
        3-Static variabllara ulasmak icin update etmek icin obje ismi kullanmaya gerek yoktur
        baska classdan cagırmak icin classismi.staticvariableismi yazılır.
         */
        System.out.println(personel1.persIsmi);
        System.out.println(hastaneismi);
        System.out.println(personel1.bashekim);

        C03_StaticKeyword personel2=new C03_StaticKeyword();

        personel2.persIsmi="Dogan";
        System.out.println(personel2.persIsmi);
        System.out.println(personel1.persIsmi);
        personel2.bashekim="Sumeyra Gunel";
        System.out.println(personel1.bashekim);
    }
}
