package day09_SwıchStatement_StringManip;

import java.util.Locale;

public class C06_StringManipulation {
    public static void main(String[] args) {
        //toUppercase: büyük harf
        //toLowercase: kucuk harf

       String str="Java Candir";
        System.out.println(str.toUpperCase());//JAVA CANDIR

        // Strıng Manıpulatıona atama yapılmazsa asıl varıable degismez.

        str=str.toUpperCase();

        //artık varıable degismis oldu.

        System.out.println(str.toLowerCase());//java candir
        str=str.toLowerCase(Locale.forLanguageTag("TR"));
        System.out.println(str);
















    }
}
