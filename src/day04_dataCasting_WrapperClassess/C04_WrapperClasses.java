package day04_dataCasting_WrapperClassess;

import java.util.Scanner;

public class C04_WrapperClasses {
    public static void main(String[] args) {
        // non-primitive data turlerinin hazir methodlari varken
        // primitive data turlerinin hazir methodlari yoktur.
        //Java pirimitive data turleri icin kolayca gecis yapabilecekleri
        //non pirimitive data turleri olusturmustur.

        /*
        int ==>Integer
        byte ==>Byte
        char==>Character
        boolean ==> Boolean
 */
        Integer sayi=10;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        String sonucStr="345";
        System.out.println(sonucStr + 10);//34510

      int sonuc=  Integer.parseInt(sonucStr);
        System.out.println(sonuc+ 10);//355
        sonuc=Integer.valueOf(sonucStr);
        System.out.println(sonuc +10);//355

        char krk='3';
        System.out.println(Character.isDigit(krk));//true
        System.out.println(Character.isLetter(krk));//false





    }


}
