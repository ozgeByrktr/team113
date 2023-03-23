package day28_accessModifier;

public class C03_EncapsuleDatalar {


     static private String isim="Yildiz Pazarlama";

     private int satisTutari;
     public int toplamSatis;

     public int getToplamSatis() {
          return toplamSatis;
     }

     public static String getIsim() {
          return isim;
     }

     public void setSatisTutari(int satisTutari) {
          this.satisTutari = satisTutari;
          toplamSatis+=satisTutari;
     }

}
