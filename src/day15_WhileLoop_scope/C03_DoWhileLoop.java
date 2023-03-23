package day15_WhileLoop_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        while loop'da bitis sarti kontrolu her zaman body^den bir fazla calisir
        while loop'da kullanıcıdan alacagımız degerlere once bizim deger atamamız gerekir
        bu da bazen hatalara sebep olur
         */
        int sayi=3;
        int toplam=0;

        while (sayi>0){
            toplam+=sayi*sayi;
            sayi--;
        }

        System.out.println("while toplam:"+toplam);

        sayi=3;
        toplam=0;

        do{
            toplam+=sayi*sayi;
            sayi--;
        }while (sayi>0);
        System.out.println("do while toplam :"+toplam);
    }

}
