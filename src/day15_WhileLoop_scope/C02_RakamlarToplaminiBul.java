package day15_WhileLoop_scope;

public class C02_RakamlarToplaminiBul {






    public static int rakamlarToplaminiBul(int verilenSayi){
        int sayi= verilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        int basamakSayisi= (sayi+ "").length();

        for (int i = 1; i <= basamakSayisi ; i++) {
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

        }
        return rakamlarToplami;
    }
}
