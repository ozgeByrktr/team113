package day08_NestedIfElse_Ternary;

public class C05_Ternary {
    public static void main(String[] args) {
        //Trenary operatoru ya sout icerisinde kullanilir
        //ya da bir degiskene atama yapilacak sekilde yazilir.


        int sayi=20;
       // sayi%2==0 ?"Cift Sayi" : "Tek Sayi"; bu sekilde yazılırsa java hata verir.
        System.out.println(sayi%2==0 ? "Cift Sayi ":"Tek Sayi");

        //eger true olduğunda sonuc ile false oldugunda sonuc farklı data turlerinde olursa
        // sayi cift ise "sayi cift" yazdırın
        // degilse sayının iki katını yazdırın.

        System.out.println(sayi%2==0 ?"Cift Sayi" : 2*sayi);

        //data turleri farklıysa yazdırılır fakat atama yapılmaz.



    }


}
