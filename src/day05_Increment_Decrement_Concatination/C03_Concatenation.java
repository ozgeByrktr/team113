package day05_Increment_Decrement_Concatination;

public class C03_Concatenation {
    public static void main(String[] args) {

        //bir String baska bir String veya baska bir data turunden variable ile + işareti ile birleştirilebilir.

        String a="Java";
        String b="Güzeldir";
        System.out.println(a +" "+ b);

        int c= 10;
        int d= 20;
        System.out.println(a+c+d);//Java1020
        // Eger String ile baska data turundeki bir deger toplanirsa java sonucu String yapar.

        System.out.println(a + (c+d));//Java30
        //parantez ici önceligi oldugundan java once parantez icini yapar.

        System.out.println(a+c*d);//Java200

        System.out.println(d+c+a);//30Java









    }
}
