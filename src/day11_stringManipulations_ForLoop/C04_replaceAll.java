package day11_stringManipulations_ForLoop;

public class C04_replaceAll {
    public static void main(String[] args) {
        //str deki sayıları methodla temizleyin
        String str="J1a23va34 5C54and65ir87";

        /*
        eger degistirmek istedigimiz metin tek bir metin degil,
        ortak özellikleri olan farklı metinlerse
        -tum sayılar
        -sayi olmayanların tumu
        -spaceler
         */
        /* (Regular Expressions)
        \\s bosluk (
        \\S bosluk disindaki tum karakterler
        \\w harfler ve rakamlar (a z A Z, 0 9)
        \\W harfler ve rakamlar disindaki tum karakterler
        \\d rakamlar 0 9
        \\D rakamlar disindaki tum karakterler,

*/

        str=str.replaceAll("\\d","");
        System.out.println(str);










    }
}
