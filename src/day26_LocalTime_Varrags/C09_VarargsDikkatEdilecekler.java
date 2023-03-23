package day26_LocalTime_Varrags;

import java.util.Arrays;

public class C09_VarargsDikkatEdilecekler {
    public static void main(String[] args) {
        //verilen sayılardan ilki hariç digerlerini toplasın
        // sonra toplam ile ilk sayiyi carpıp yazdırsın.

        //topla(2,3,4,5,6,7);

        //dikkat2
        //Varargs bir parametre olarak kullanılmıssa kendisinden sonra parametre kabul etmez.
        //Bir methodda Varargs kullanılacaksa En son parametre olmalıdır
        //sonda deger bırakmak istemez oyuzden son sayıyı ayırmamıza izin vermez
        //Dikkat 3
        //Bir methodda iki varargs kullanılamaz
        //çünkü varargs son parametre olmalıdır.CTE verir.

    }

    public static void topla(int... a) {
        System.out.println(Arrays.toString(a));
        int toplam = 0;
        for (int each : a
        ) {
            toplam += each;
        }
        System.out.println("Toplam : " + toplam);

    }
    /*Dikkat1-
     her ne kadar parametre sayısı farklı olsa da varargs ın yapısından dolayı
    int a,int..b ile ,int...b arasından argument
    kabulu acısından fark yoktur
    */
    public static void topla(int c,int... a) {
        System.out.println(Arrays.toString(a));
        int toplam = 0;
        for (int each : a
        ) {
            toplam += each;
        }
        System.out.println("Toplam*ilkSayi : " + toplam*c);
    }
}
