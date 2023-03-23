package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayLists {
    public static void main(String[] args) {
       /*
       ArrayList, uzunlugu esnek bir listedir.
       array alt yapısını kullanir
       ancak ekleme ve silme gibi islemlerde daha avantajlıdır.

       ArrayListin tek dezavantaji o da elementleri tektek eklememiz gerekmesi
        */
        List<String> harfler=new ArrayList<>();//bos bir list olusturur.
        System.out.println(harfler);//[]

        harfler.add("s");
        harfler.add("l");
        harfler.add("a");
        System.out.println(harfler);

    }
}
