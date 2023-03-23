package day13_MethodOlusturma;

public class C03_Faktoryel {
    public static void main(String[] args) {

     // verdiğimiz bir sayının faktoryelini hesaplayip sonucu bize döndüren bir method olusturun.

      int sonuc=  faktoryelHesapla(5);
        System.out.println(sonuc);
    }

    /* Method olusturma asamaları:
    1-public static simdilik standart
    2-sonuc döndurecekse ,data turlerini yaz
    3-method ismi
    4-parametre
    5-dondurulmesi istenen islemi yap
     */

    public static int faktoryelHesapla(int sayi){
        int faktoryel=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *=i;
        }
        return faktoryel;

    }
}
