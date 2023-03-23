package day09_SwıchStatement_StringManip;

import java.util.Scanner;

public class C02_Swıtch {
    public static void main(String[] args) {
        //Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen SDET kisaltmasindaki harflerden birini giriniz");
        char harf=scan.next().toUpperCase().charAt(0);
        switch (harf){
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E' :
                System.out.println("Engineer");
                break;
            case 'T' :
                System.out.println("In Testing");
                break;
            default :
                System.out.println("Lutfen gecerli bir harf giriniz.");
        }





    }
}
