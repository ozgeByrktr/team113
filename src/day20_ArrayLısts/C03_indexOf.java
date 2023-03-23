package day20_ArrayLısts;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String>isimler=new ArrayList<>();
        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Erdal");

        System.out.println(isimler);//[Kubra, Mustafa, Emre, Ferhat, Erdal]
        //2.indexini yazdirin
        System.out.println(isimler.get(2));//Emre

        //Ferhatin indexini yazdirin
        System.out.println(isimler.indexOf("Ferhat"));

        System.out.println(isimler.lastIndexOf("Ferhat"));

        System.out.println(isimler.indexOf("Hilal"));//-1


    }
}
