package day04_dataCasting_WrapperClassess;

public class C01_AsciiTable {
    public static void main(String[] args)
    {

        /*
        24==>1100
        a ==> 97 ==>10100010
        ahmet
         */
//char data turundeki variable ve degerler sayisal data turleri ile karsilasirsa
// ve ya turlerine atanirsa veya sayisal data turundeki datalarla isleme sokulursa
// ascii table daki degerleri ile işleme girer.

        System.out.println(5 + 'a');// 5+97=102
        char ilkharf=101;
        System.out.println(ilkharf);//e
        //Kullanicinin verdigi harften bir sonraki harfi yazdirin

        char girilenChar='f';
        System.out.println(girilenChar + 1);
        //explicing casting yapmamiz gerekiyor
        System.out.println("Girilen harfin bir sonrası: "+(char) (girilenChar + 1));


        girilenChar='M';
        System.out.println ((char)(girilenChar - 2));


    }


}
