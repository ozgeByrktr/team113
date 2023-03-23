package day08_NestedIfElse_Ternary;

import java.util.Scanner;

public class C10_SwıtchStatements {
    public static void main(String[] args) {

        //kullanicidan bir harf isteyin o harf ile baslayan gun ismi varsa yazdırın
        // yoksa gecersiz harf yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz :");
        char harf=scan.next().charAt(0);
        harf=Character.toUpperCase(harf);

        if (harf=='P'){
            System.out.println("Pazar , Pazartesi veya Persembe");
        } else if (harf=='C') {
            System.out.println("Carsamba , Cuma veya Cumartesi");

        } else if (harf=='S') {
            System.out.println("Sali");

        }else {
            System.out.println("Gecersiz harf");
        }


        System.out.println("=================");
        switch (harf){
            case 'S':
                System.out.println("Sali");
                break;
            case 'P':
                System.out.println("Pazar , Pazartesi veya Persembe");
                break;
            case 'C':
                System.out.println("Carsamba , Cuma veya Cumartesi");
                break;
            default:
                System.out.println("Gecersiz Harf");
        }


    }
}
