package day43_HashSet;

import java.util.HashSet;
import java.util.Set;

public class C02_TekrarEdenElemanlar {
    public static void main(String[] args) {
           /*
        Soru:
        Verilen bir arraydeki tekrar eden elementleri sadece 1 kere yazdıracak array'i kısaltan bir kod yazınız
        Hint: SET Kullanınız.
        int [] arr={1,2,1,3,4,5,1,2,6,2,3,4,5,1,3,2,6,5,7}
         */
        int [] arr={1,2,1,3,4,5,1,2,6,2,3,4,5,1,3,2,6,5,7};

        Set<Integer>liste=new HashSet<>();
        for (Integer each:arr
             ) {
            liste.add(each);
        }
        System.out.println(liste);
    }
}
