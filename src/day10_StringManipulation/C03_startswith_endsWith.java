package day10_StringManipulation;

public class C03_startswith_endsWith {
    public static void main(String[] args) {

        String str="Java harika";

        System.out.println(str.startsWith("java"));//false
        System.out.println(str.startsWith("Ja"));//true

        System.out.println(str.startsWith(str));//true
        System.out.println(str.startsWith(""));//true

        System.out.println("============================");

        System.out.println(str.endsWith("a"));
        System.out.println(str.endsWith("ka"));
        System.out.println(str.endsWith("Java harika"));
        System.out.println(str.endsWith(""));
        System.out.println(str.endsWith(str.substring(str.length() - 1)));


    }

}
