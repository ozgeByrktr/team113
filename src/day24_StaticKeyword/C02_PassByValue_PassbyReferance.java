package day24_StaticKeyword;

public class C02_PassByValue_PassbyReferance {
    public static void main(String[] args) {

        double fiyat = 200;

       /*
        int fiyat=500;
        String fiyat="Java pass by value kullanir";

        Java ayni method icerisinde ayni isimle birden fazla variable olusturlmasına izin vermez.
        */
        indirimYap10(fiyat);
        System.out.println("method call'dan sonra fiyat:"+fiyat);
        //Java bir methoddan baska bir class'a variable gönderirken pass by value degerini kullanır.
        // Degerinin gecis yapmasına izin verir.İsmi ne olursa olsun farketmez,aslını göndermez.
        indirimYap25(fiyat);
        System.out.println("İkinci indirim sonrası fiyat: "+fiyat);
        System.out.println("return'den sonra : "+indirimliFiyatGetir10(fiyat));
        System.out.println("3. methoddan sonra fiyat: "+fiyat);
        //main methoddaki fiyatı kalıcı olarak degistirmek istersek main method içerisinde atama yapmalıyız.
        fiyat=indirimliFiyatGetir10(fiyat);
        System.out.println("Main methodda atama yaparken: "+fiyat);
    }
    public static void indirimYap10(double fiyat){
        fiyat=fiyat*0.9 ;
        System.out.println("%10 indirimli fiyat: "+ fiyat);
    }
    public static void indirimYap25(double fiyat){
        fiyat=fiyat*0.75 ;
        System.out.println("%25 indirimli fiyat: "+fiyat);

    }
    public static double indirimliFiyatGetir10(double fiyat){
        fiyat=fiyat*0.9;
        return fiyat;
    }
}
