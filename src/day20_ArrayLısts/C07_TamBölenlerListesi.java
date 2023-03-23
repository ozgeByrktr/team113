package day20_ArrayLısts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_TamBölenlerListesi {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.

        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif bolenlerini bulmak icin pozitif bir tam sayi giriniz: ");
        int girilenSayi= scan.nextInt();
        System.out.println(pozitifBolenleriListele(girilenSayi));

    }
    public static List<Integer>pozitifBolenleriListele(int verilenSayi){

        List<Integer>pozitifBolenlerListesi=new ArrayList<>();
        for (int i = 1; i <=verilenSayi ; i++) {
            if (verilenSayi%i==0){
                pozitifBolenlerListesi.add(i);
            }
        }
        return pozitifBolenlerListesi;
    }
}
