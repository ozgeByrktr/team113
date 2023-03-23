package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_get_set {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        System.out.println(sayilar);

        System.out.println(sayilar.get(0));//3
        //son elementi yazdır
        System.out.println(sayilar.get(sayilar.size() - 1));//2

        //2 elementini 12 yapin
        //set update için kullanilir.*guncelleme*
        System.out.println(sayilar.set(2, 12));//
        System.out.println(sayilar.set(1, 7));//5 degisen elementi getirir
        System.out.println(sayilar);//[3, 7, 12]


    }
}
