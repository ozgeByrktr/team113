package day28_Deneme;

import day28_accessModifier.C03_EncapsuleDatalar;

public class AccessModifierKullanimi {
    public static void main(String[] args) {


         C03_EncapsuleDatalar obj = new C03_EncapsuleDatalar();
         System.out.println(obj.toplamSatis);//read
         obj.   toplamSatis=100;//write


        //ulasmak istedigimiz variable veya methoda ulasmak istedigimiz Class uyesinin
        //static olup olmamasi erisim yöntemini etkiler
        //static ise classismi.uyeismi yazarken
        //static degil ise obje olusturup objeismi.uyeismi

        //ulasmak istedigimiz uyenin access modifierı ise o uyeye ulasıp ulasamyacagımızı belirler
        //ulasabilirsek o datayı okuyabilir veya o dataya yeni deger atayabiliriz.

    }
}
