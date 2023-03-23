package day09_SwıchStatement_StringManip;

public class C09_charAt {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(0)); //J

        //6.karakteri yazdırınız
        System.out.println(str.charAt(6)); //C

        // * space de bir karakterdir. *
        // sondan ikinci karakteri yazdırın

        System.out.println(str.charAt(11-2));//i
        //sondan birinci harfi yazdirin.
        System.out.println(str.charAt(11-1));//r

        //11 ve ondan sonrasını yazdırmaya calısırsak hata verir.

        /* Java'da iki turlu hata  şle karsılasabiliriz.
        1- syntex olarak hatali yazilan kodlari java compile ederken anlar ve altini kirmizi cizer
            str=23 yazarsak String bir variable int deger atanamayacagini bilir ve altini kirmizi çizer.
            CompileTimeError  CTE diyoruz
        2- bazen de syntex de hata olmaz java sorunu run ettikten sonra fark eder.
            str.charAt(15): burada bir karakter istenir
            compile time da strnin uzunlugunu java anlamaz;
            ama çalısınca 15. ındexin olmadigini fark eder ve exeption fırlatır.
            RunTimeError RTE verir

         */


    }
}
