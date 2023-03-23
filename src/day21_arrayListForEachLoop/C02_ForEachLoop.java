package day21_arrayListForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        /*
        bizden istenen görevde sıralama önemsiz ise
        asıl amaçlanan tum elementleri elden gecirmek ise for loop yerine ForeachLoop tercih edilir.
        index yok
        baslangıc degeri yok
        bitis degeri yok
        sıralama yok/  *array e git her bir int i bana getir.*
         */
        int toplam=0;
        int[]arr={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};
        //arr'nin tum elementlerinin toplamini yazdirin
        for (int each: arr
             ) {
            toplam+=each;
        }
        System.out.println("Elementler toplamı: "+toplam);

        //arr'nin elementlerinden 3ile bölünebilenleri yazdirin.
        for (int each: arr
             ) {
            if(each%3==0)
            System.out.print(each +" ");
        }
        System.out.println("");

        //arr'nin elementleri icinde kac tane tek sayi oldugunu bulun
        int sayac=0;
        for (int each: arr
             ) {
            if(each%2!=0) sayac++;
        }
        System.out.println("Array'deki tek sayi adedi: "+sayac);
    }
}
