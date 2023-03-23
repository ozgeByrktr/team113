package day09_SwıchStatement_StringManip;

public class C07_equals {
    public static void main(String[] args) {

        String str1="Java";
        String str2="JAVA";
        String str3="java";
        String str4="jaVa";

        System.out.println(str1.equals(str2));//false

        System.out.println(str3.equals(str4));//false


        //eger buyuk kucuk harfe dikkat etmeden str karsılastırmak ıstersenız:
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str4));//true

        String str5="Java";
        String str6="Ja";
        String str7="va";
        String str8=str6.concat(str7);
        System.out.println(str8);//Java
        System.out.println(str1==str5);//true
        System.out.println(str1==str8);//false


        /*
        == ile Stringleri karsilastirirsak hem metin degerine hem de referanslarina bakar
        equals ile karsılastırırsak sadece metin degerine bakar

        iki String i karsilastiracaksak == degil equals kullaniriz.
         */





    }

}
