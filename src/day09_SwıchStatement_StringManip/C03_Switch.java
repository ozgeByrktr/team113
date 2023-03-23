package day09_SwıchStatement_StringManip;

import java.util.Scanner;

public class C03_Switch {
    public static void main(String[] args) {
      //  Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gün numarasi giriniz:");
        int gunNo= scan.nextInt();
        switch (gunNo){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:

            case 7:
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("**Lutfen gecerli bir gun numarasi giriniz.**");

        }


    }
}
