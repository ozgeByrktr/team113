package day08_NestedIfElse_Ternary;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");

        int sayi= scan.nextInt();
        System.out.println( sayi%2==0 ? "Cift sayi" : "Tek sayi");



    }
}
