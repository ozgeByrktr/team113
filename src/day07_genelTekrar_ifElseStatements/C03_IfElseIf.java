package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C03_IfElseIf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi= scan.nextInt();
        if(sayi %3==0 && sayi%5==0){
            System.out.println("3'un ve 5'in kati");

        } else if (sayi%5==0) {
            System.out.println("5'in kati");{

            }
        } else if (sayi %3==0 ) {
            System.out.println("3'un kati");

        }else{
            System.out.println("ne 3'un ne de 5'in kati" );

    }








    }



}
