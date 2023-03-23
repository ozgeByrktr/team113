package day04_dataCasting_WrapperClassess;

import java.util.Scanner;

public class C02_AsciiTable {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenharf= scan.next().charAt(0);

        System.out.println("Girilen harf :" + girilenharf +
               "\nGirilen harften sonraki 3 harf :"+
                (char) (girilenharf+1)+" , " +
                (char) (girilenharf +2)+" , "+
                (char)(girilenharf+ 3));


    }
}
