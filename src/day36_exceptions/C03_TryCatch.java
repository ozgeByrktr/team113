package day36_exceptions;

public class C03_TryCatch {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=0;


        try {
            System.out.println(sayi1/sayi2);//Exception olusursa butun satırlari ignore eder;olusan exception yakalanana kadar!!
            System.out.println("deneme 1");
            System.out.println("deneme 2");
            System.out.println("deneme 3");
        } catch (ArithmeticException e) {
            System.out.println("Bolen Sıfır olmamalı");;
        }
        /*
        Bir tray blogunda exception olusursa o satırdan catch satırına kadar aradaki tum notlar ignore edilir
        eger try blogunda exception olusmazsa catch devreye girmez!!if else mantıgı
         */


    }
}
