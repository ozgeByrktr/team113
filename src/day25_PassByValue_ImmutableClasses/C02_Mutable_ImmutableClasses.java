package day25_PassByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_Mutable_ImmutableClasses {
    public static void main(String[] args) {
        String str="Java gun gectikce daha da keyifli oluyor";
        str.substring(5);
        str.substring(3,15);
        str.startsWith("Jawa");
        str.toLowerCase();
        System.out.println(str);

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(8);
        System.out.println(sayilar);
        /*
        String ve Wrapper Classlar immutable oldukları için degistirilemezler
        ancak Array ve lıst atama yapmasakda method kullanınca degerleri degişir.
         */
        sayilar.set(0,7);
        sayilar.remove(1);
        System.out.println(sayilar);
    }
}
