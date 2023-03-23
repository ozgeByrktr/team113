package day03_dataCastıng_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        // kullanici sayi1=10 , sayi2=20 degeri girdiginde
        //

        Scanner scan=new Scanner(System.in);

        System.out.println("Sayi1'i giriniz(tam sayi)");

        int sayi1= scan.nextInt();

        System.out.println("Sayi2'yi giriniz(tam sayi)");

        int sayi2= scan.nextInt();

        int temp=0;
        temp=sayi2 ;

        sayi2=sayi1 ;

        sayi1=temp ;


        System.out.println("Sayi1'in yeni degeri:"+ sayi1);
        System.out.println("sayi2'nin yeni degeri:"+ sayi2);







    }
}
