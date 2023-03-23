package day02_dataturleri_SCANNER;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // 1.adim: Scanner objesi olusturun

        Scanner scan=new Scanner(System.in);
        //2. adim:kullaniciya ne istediğinizi soyleyin
        System.out.println("Lutfen isminizi giriniz");
        //3.adim: girilen bilgi icine koyabilecegimiz bir variable olusturun

        String kullaniciIsmi= scan.next();

        System.out.println("Girilen isim:"+kullaniciIsmi);


    }





}
