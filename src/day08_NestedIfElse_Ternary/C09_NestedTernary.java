package day08_NestedIfElse_Ternary;

public class C09_NestedTernary {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alin.
        //Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani
        //yazdirin
        //Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        //uygun olani yazdirin
        int sayi=20;
        System.out.println(sayi>0
                            ?sayi%2==0?"Cıft sayi":"Teksayi"
                            :sayi>-1000 && sayi<-99 ?"Uc basamakli" :"Uc basamakli degil");



    }
}
