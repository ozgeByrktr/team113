package day02_dataturleri_SCANNER;

import java.util.Scanner;

public class C05_ScannerIlkGorev {
    public static void main(String[] args) {
        //kullanıcıdan bir sayi alin
        // ve sayinin karesini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double girilenSayi= scan.nextDouble();
        System.out.println("Girilen sayinin karesi :" + girilenSayi*girilenSayi);

    }
}
