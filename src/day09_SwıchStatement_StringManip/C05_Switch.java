package day09_SwıchStatement_StringManip;

import java.util.Scanner;

public class C05_Switch {
    public static void main(String[] args) {

    //Kullanicidan bir ay no aliniz ve mevsim olarak yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ay numarasi giriniz:");
        int ayNo= scan.nextInt();
        switch (ayNo){
            case 12:

            case 1:

            case 2:
                System.out.println("Kıs");
                break;
            case 3:

            case 4:

            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:

            case 7:

            case 8:
                System.out.println("Yaz");
                break;
            case 9:

            case 10:

            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("**Lutfen gecerli bir ay numarasi giriniz.**");

        }









    }
}
