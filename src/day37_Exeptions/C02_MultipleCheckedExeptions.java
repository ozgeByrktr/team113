package day37_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_MultipleCheckedExeptions {
    public static void main(String[] args) {
        // metin txt dosyasindaki yazilari yazdiralim

        /*
            Eger birden fazla catch cumlemiz varsa ve exception'lar arasinda
            parent-child iliskisi varsa
            1- ikisini de yazmak istiyorsak, once child exception, sonra parent yazilmalidir
               aksi takdirde parent ustte olursa, tum exception'lari yakalayacagindan
               child exception'i yazmak anlamsiz olur
            2- ikisini yazmak istemezsek, sadece parent exception yeterli olacaktir
               cunku parent daha kapsayicidir ve daha cok exception'i yakalar
         */


        try {
            FileInputStream fis = new FileInputStream("src/day36_exceptions/text.txt");
            int k=0;
            while((k= fis.read() ) != (-1)){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

