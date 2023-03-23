package day08_NestedIfElse_Ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        double sayi= scan.nextDouble();
        // atama yaparsak:
        // sayi=sayi>=0 ? sayi : (-1*sayi)

        System.out.println(sayi>=0 ? sayi : (-1*sayi));


    }
}
