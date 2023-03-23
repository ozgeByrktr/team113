package day21_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_OrtakElementleriBulma {
    public static void main(String[] args) {
        //soru 5- Verilen iki array’in elementlerini karsilastirip,
        // ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.

        Integer[]arr1={2,3,6,7,4};
        Integer[]arr2={1,3,5,7,9,3};
        List<Integer>OrtakElementlerListesi=new ArrayList<>();

        for (Integer each: arr1) {
            for (Integer each2:arr2) {
                if (each==each2 && !OrtakElementlerListesi.contains(each)){
                    OrtakElementlerListesi.add(each);
                }
            }

        }
        System.out.println(OrtakElementlerListesi);
    }
}
