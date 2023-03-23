package day35_interfaces;

import java.util.ArrayList;
import java.util.List;

public class C02_ChildOfI01veI03 implements I01_interface ,I03_interface{
/*
    interface in en önemli ozelligi bir classın birden fazla implement edebilmesidir.
    Ancak;birden fazla interface i implament ederken dikkat etmemiz gerekn bir konu vardir.
    o da eger implement etmek istedigimiz farkli interface lerde ayni isimde fakat farkli return type olan methodlar varsa
    ikisi methodu birden aynı anda implement edemeyecegimiz için o iki interface den birini implement edebiliriz.

 */
    @Override
    public void toplama() {

    }

    @Override
    public void cikarma() {

    }

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktoriyel() {
        return 0;
    }

    @Override
    public void bolme() {

    }

    public static void main(String[] args) {
        C02_ChildOfI01veI03 obj=new C02_ChildOfI01veI03();
        System.out.println(I01_interface.str);
        System.out.println(I03_interface.str);

        List<String> harfler=new ArrayList<>();
    }
}
