package day27_stringBuilder;

public class C03_equals_compare {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        //Java'da farklı data turune sahip non primitive objeler == ile karsılastırılamaz.

        System.out.println(sb1==sb2);//false
        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(str));//false
        //StringBuilder Classında equals methodu yoktur.equals methodunu parent classı olan object classından kullanır.
        //bundan dolayı içeriklere bakmadan false verir.

        /*
        iki StringBuilder'ın içeriklerinin aynı oldugunu kontrol etmek için * compereTo() * methodu kullanılır.
        karsılastıran StringBuilder'lar ayni metne sahipse 0 döner.
        aynı degilse, bastan iitibaren kontrole baslar farklı olan ilk harfin karsılastırılan
         kelimedeki aynı indexdeki harften kac harf ileri oldugunu döndurur.(ascii table daki int degerlerin farkı)
         */
        System.out.println(sb1.compareTo(sb2));//0
        //System.out.println(sb2.compareTo(str));//CTE
        StringBuilder sb3=new StringBuilder("Hava");
        StringBuilder sb4=new StringBuilder("Hara");

        System.out.println(sb1.compareTo(sb3));//2
        System.out.println(sb1.compareTo(sb4));//2
        System.out.println(sb3.compareTo(sb4));//4
    }
}
