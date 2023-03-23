package day06_Ifstatement;

import java.util.Scanner;

public class C03_Ifstatement {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc kenar uzunlugunu giriniz ,her birinden sonra enter'a basiniz.");

        double knr1= scan.nextDouble();
        double knr2= scan.nextDouble();
        double knr3= scan.nextDouble();
        if (knr1==knr2 && knr2==knr3 && knr1>0){
            System.out.println("Eskenar ucgen");
        }
    }
}
