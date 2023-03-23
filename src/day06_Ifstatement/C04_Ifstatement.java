package day06_Ifstatement;

import java.util.Scanner;

public class C04_Ifstatement {
    public static void main(String[] args) {
        // Kullanicidan notunu alin
        //  50 veya daha buyukse ”Sinifi Gectin”,
        //  50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not= scan.nextDouble();
        if (not>=50 && not<=100)
            System.out.println("Sınıfı Gectiniz");
            if (not<50)
                System.out.println("Maalesef kaldiniz");








    }
}
