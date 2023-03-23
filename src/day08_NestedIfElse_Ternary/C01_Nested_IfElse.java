package day08_NestedIfElse_Ternary;

import java.util.Scanner;

public class C01_Nested_IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz :" +
                "\nKadin icin : K, Erkek icin : E giriniz)");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'E') {
            if (yas < 16 || yas > 80) {
                System.out.println("Gecerli bir yas giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olmak icin " + (65 - yas) + " yıl daha calismalisin");
            } else {
                System.out.println("Emekli Olabilirsiniz");
            }
        } else if (cinsiyet == 'K') {
            if (yas < 16 || yas > 80) {
                System.out.println("Gecerli bir yas giriniz");
            } else if (yas < 60) {
                System.out.println("emekli olmak icin " + (60 - yas) + " yıl daha calismalisin");
            } else {
                System.out.println("Emekli Olabilirsiniz");
            }
        } else {
            System.out.println("Lutfen gecerli bir cinsiyet giriniz..");
        }







    }
}
