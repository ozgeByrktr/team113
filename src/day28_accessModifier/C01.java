package day28_accessModifier;

public class C01 {

    String str;
    //Class leveldeki her class uyesinin access modifierı olur.
    // eger access modifier gorunmuyorsa java o class uyesine default access modifier atar.

    public int sayi;
    static String s;
    public static int a;
    private int b;
    private static int c;
    //default degerler hem classta hem packege da goruntulenir.
    public int d;


    public static void main(String[] args) {
        int sayi = 10;
        /*
        Bir method içerisinde public,private,protected gibi access modifierler yada static keyword kullanilamaz.
         */

        // System.out.println(b); static olmadigı için b ye ulasamadık.
        System.out.println(c);
    }

    void method1() {
        System.out.println(b);
        System.out.println(c);

    }

    static void method2() {

    }

    public void method3() {

    }
}
