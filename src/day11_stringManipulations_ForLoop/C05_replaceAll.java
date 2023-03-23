package day11_stringManipulations_ForLoop;

public class C05_replaceAll {
    public static void main(String[] args) {
        String str="J&ava54 C+an01dir,,,";

        //str'i Java Candir haline getirin

        str=str.replaceAll("\\d","");
        System.out.println(str);

         /* (Regular Expressions)
        \\s bosluk (
        \\S bosluk disindaki tum karakterler
        \\w harfler ve rakamlar (a z A Z, 0 9)
        \\W harfler ve rakamlar disindaki tum karakterler
        \\d rakamlar 0 9
        \\D rakamlar disindaki tum karakterler,
*/
        str=str.replaceAll(" ","5");
        System.out.println(str);

        str=str.replaceAll("\\W","");
        str=str.replaceAll("5"," ");
        System.out.println(str);
        //str=str.trim(); kesmek demek
        //String str = "J&ava54 C+an01dir,,,";
        //System.out.println(str.replaceAll("[&,0-9,+]", ""));



    }
}
