package day09_SwıchStatement_StringManip;

import java.util.Scanner;

public class C04_Switch {
    public static void main(String[] args) {
       //Kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ay numarasi giriniz:");
        int ayNo= scan.nextInt();
        switch (ayNo){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("**Lutfen gecerli bir ay numarasi giriniz.**");

        }






    }
}
