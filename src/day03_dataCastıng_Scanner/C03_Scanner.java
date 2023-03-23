package day03_dataCastıng_Scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen cemberin yari capini giriniz");


        double yaricap= scan.nextDouble();

        System.out.println("Cemberin cevresi : " + 2*3.14* yaricap);
        System.out.println("cemberin alani : " + 3.14* yaricap*yaricap);





    }
}
