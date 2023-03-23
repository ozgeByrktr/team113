package day32_inheritance_dataTypeKullanimi;

public class CAvciKuslar extends BKuslar {
    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidirler";
    String gaga = "sivri gagali";

    public static void main(String[] args) {
        CAvciKuslar kartalAvci=new CAvciKuslar();
        //Constructor AvciKuslar Clasından bir obje olusturduk
        //Enguncel bilgiler avci kuslar classında
        System.out.println(kartalAvci.hareket);// C ucarlar
        System.out.println(kartalAvci.beslenme);//C et yerler
        System.out.println(kartalAvci.pence);//C pencelidir
        System.out.println(kartalAvci.gaga);//C sivri gaga
        System.out.println(kartalAvci.kanat);//B kanatlidir
        System.out.println(kartalAvci.solunum);//B akciger
        System.out.println(kartalAvci.cogalma);//B yumurta
        System.out.println(kartalAvci.omur);//A

        System.out.println("");

        BKuslar kartalKus=new CAvciKuslar();

        System.out.println(kartalKus.hareket);// A hareket ederler
        System.out.println(kartalKus.beslenme);//A beslenir
        //System.out.println(kartalKus.pence);//CTE
        System.out.println(kartalKus.gaga);//B gagalari vardır
        System.out.println(kartalKus.kanat);//B kanatlidir
        System.out.println(kartalKus.solunum);//B akciger
        System.out.println(kartalKus.cogalma);//B yumurta
        System.out.println(kartalKus.omur);//A yasarlar ve olurler
        System.out.println("");

        AHayvanlar kartalHayvan=new CAvciKuslar();

        System.out.println(kartalHayvan.hareket);// A hareket ederler
        System.out.println(kartalHayvan.beslenme);//A beslenir
        //System.out.println(kartalKus.pence);//CTE
        //System.out.println(kartalHayvan.gaga);//CTE
        //System.out.println(kartalHayvan.kanat);//CTE
        System.out.println(kartalHayvan.solunum);//A nefes alir
        System.out.println(kartalHayvan.cogalma);//A cogalir
        System.out.println(kartalHayvan.omur);//A yasarlar ve olurler

        /*
         Eger bir obje olusturulurken Data turu ve Constructor ayni ise
        aradiğimiz özellikler için direk o class a gider ve o ozellikleri ararız.

         Eger data turu ve constructor farkli ise
        variable ve methodlar farkli davranirlar.

        Bir ozelligi veriable olarak olusturursanız data turu olan class ve parentlarindaki ortak ozelliklere bakar
        en guncel bilgiyi aramaz.
        ortak bilgileri arar en guncel bilgiyi aramaz.
         */

    }
}
