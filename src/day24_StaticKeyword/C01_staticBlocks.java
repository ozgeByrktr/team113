package day24_StaticKeyword;

public class C01_staticBlocks {

    public static void main(String[] args) {
        System.out.println("main method calıstı");
        C01_staticBlocks obj1 = new C01_staticBlocks();
    }

    static {
        /*
        static blocklar class ilk calısmaya basladıgında calısır.
        genel olarak class icin gerekli ön ayarlamaları yapmak icin kullanılır.
        birden fazla static blocks varsa yukarıdan asagıya dogru sıralı olarak calısır
         */
        System.out.println("Static block calıstı");
    }
    static {
        System.out.println("Alttaki static block calıstı");
    }

    {   //Static olmayan blocklar ise obje olusturulurken constructordan önce calısır.
        //obje icin yapilmasi gereken ön ayarlamaları yaparlar


        System.out.println("Static olmayan blocks calıstı");
    }
}
