package day25_PassByValue_ImmutableClasses;

public class C03_ImmutableClasses {
    public static void main(String[] args) {
        String str="Java candir";

        str=str.toLowerCase();
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);
        String s="Hava";
        for (int i = 0; i <100 ; i++) {
            s=s+".";
        }

        /*
        Java'da bir class ve o classtan olusturulan objeler ya mutable'dır yada ımmutable'dır.
        Java metinsel ifadeleri atayabilecegimiz 3 class olusturmustur.
        String----immutable
        String Builder--mutable
        StringBuffer--mutable
        Immutable bir classtan olusturulan objelerde ımmutabledır.
        String ımmutable oldugundan aynı str objesine yeni deger atandıgında Java eski degeri degistiremez istenen yeni degere sahip yeni bir obje olusturur
        str'nin pointerını yeni objeye yöneltir.
        kullanılmayan eski objeler
        Garbege Collector tarafından toplanmak uzere beklerler.

         */
    }
}
