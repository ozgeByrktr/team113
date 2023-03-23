package day25_PassByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_passByValue {

    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);
        elementleriArttir(sayilar);
        //Elementleri arttır methodunu calıstırdıktan sonra
        System.out.println(sayilar+" Elementleri artan liste");
        yeniListeAta(sayilar);
        System.out.println(sayilar);
    }
       public static void elementleriArttir(List<Integer>sayilar){
        //tum elementleri 2 katına cıkaralım

           for (int i = 0; i < sayilar.size() ; i++) {
               sayilar.set(i,2*sayilar.get(i));
           }
           System.out.println("Elemanları arttır methodunda :"+ sayilar);
       }
       public static void yeniListeAta(List<Integer>sayilar){
        sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
           System.out.println("Yeni liste methodunda :"+sayilar);
       }

}
