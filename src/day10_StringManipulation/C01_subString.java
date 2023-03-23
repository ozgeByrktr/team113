package day10_StringManipulation;

public class C01_subString {
    public static void main(String[] args) {

    String str="Java ne kadar guzel";
        //substring 2 farkli sekilde kullanilabilir.
        //1-tek parametre olursa,o indexten baslar sonuna kadar yazdırır.
        System.out.println(str.substring(8));//kadar guzel

        System.out.println(str.substring(0));

        System.out.println(str.substring(str.length() - 3));//zel

        System.out.println(str.substring(str.length()));//hiçlik
        //str nin uzunluğu = 19
        //son harf uzunlugu = 18
        // 19. index de karakter yok

        //2-iki parametre girilirse baslangic indexinden (dahil) baslar
        //biris indeksine kadar (haric) devam eder.

        System.out.println(str.substring(5, 7));//ne

        System.out.println(str.substring(3, 4));//a

        System.out.println(str.substring(0,1));//J

        //strnin 5. indexteki karakterini yazdırın

        System.out.println(str.substring(5, 6));//n
        System.out.println(str.charAt(5));//n

        System.out.println(str.substring(2,2)); //hiçlik

         // System.out.println(str.substring(5, 1));
        // java da geri vites yok "runtimeerror"

    }
}
