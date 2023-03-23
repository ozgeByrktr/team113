package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Kod yazilir yazilmaz daha run etmeden riskli kodları tanımlayıp calıstırmadan önce bana bir yol göstermelisin dedigi
        exception turleridir.
        chack exception genellikle IO isşemlerinde olusur(input/output)

        IO exception olusma ihtimaline karsi kodu yazar yazmaz altını kırmızı cizer.

        1-Try-Catch blogu kullanarak exception handle edilebilir
        2-Eger exception ı handle etmek istemiyor codun calısmasını istiyorsak
        method deklarasyonuna bu exeption ihtimalini yazarak kodu calısır hale getirebiliriz.


         */
        String dosyaYolu="src/day36_exceptions/text.txt";//copy path
        FileInputStream fis=new FileInputStream(dosyaYolu);//FileNotFoundException –(method signicure) java.io.FileNotFoundException;

    }
}
