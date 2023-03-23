package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if ((cinsiyet == 'K' && yas>=60) || (cinsiyet== 'E' && yas>=65)){
            System.out.println("Emekli olabilirsin");

        } else if (cinsiyet == 'K') {
            System.out.println("Emekli olabilmek icin " +(60-yas) +" yil daha calismalisin");
        } else if (cinsiyet == 'E') {
            System.out.println("Emekli olabilmek icin " +(65-yas) +" yil daha calismalisin");

        }


    }
}
