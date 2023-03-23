package day02_dataturleri_SCANNER;

public class C02_DataTurleri {

    public static void main(String[] args) {
        char ilkharf='8';
        //tek tırnak içinde tek karakter(harf,sayı,ozel karakter...)

        byte ogrYasi1=15;//en dogru kullanım budur.hafizayi bosa kullanmamis oluruz.
        short ogryasi2=16;
        int ogrYasi3=14;
        long ogrYasi4=15;



        double sayi1=3.1234567891011121314151617;  //15-16 basamak double virgulden sonra 16 hane yazdırır,
        // ama artık cok kucuk sayılara girdiği için ondalıklı kısmın sonunda hatalar olabilir.
        // 15/ 3= 4.999999999999999999999999  5.0   5.0000000000000001

        System.out.println(sayi1);//3.123456789101112


        float sayi2=45.543334578465354648f;

        //Float sayı tanimladigimizda double'dan farkli oldugunu belirtmek icin
        //sonuna f veya F yazmak zorundayiz.
        // Biz dersler boyunca hafiza onemli olmadigi icin
        // tamsayilar icin int,ondalikli sayilar icin de double kullaniriz.



        System.out.println(sayi2);//45.543335
        //doubleden farklı oldugunu belirtmek için f  F kullanılır.









    }
}
