package day15_WhileLoop_scope;

public class C05_LocalVariable {
    public static void main(String[] args) {
        /*
        1-  bir method icerisinde olusturulan variable'in scope'u o method'dur
            baska bir method'dan kullanılamaz
            bu variable'lara local variable denir
        2-  Her ne kadar bir method icinde olsalar da
            Loop'larin da ayri bir scope'u vardir
            Loop icerisinde olusturulan variable'lar
            Loop disinda kullanılamazlar
        3-  Local variable'lari deger atamadan olusturabiliriz
            ancak deger atamadan kullanamayız
         */
        String isim="Ali Can";
        int sayi;
        //sayi++;

        for (int i = 0; i <10 ; i++) {
            int j=i+1;
        }
        //System.out.println(i);
        //System.out.println(j);
    }

    public static void baskaMethod(){

       // System.out.println(isim);
        int sayi =5;
    }
}
