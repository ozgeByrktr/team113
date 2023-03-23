package day35_interfaces;

public class C03_ChildOfI04 implements I04_interfaceIstisnalar{


    @Override
    public void toplama() {
        I04_interfaceIstisnalar.super.toplama();
    }




    public static void main(String[] args) {
        C03_ChildOfI04 obj=new C03_ChildOfI04();
        obj.toplama();
        I04_interfaceIstisnalar.aciklama();
        I04_interfaceIstisnalar.ekIsler();
        //dev iht halinde sonradan implament edilen methodlari tum eski classlara imp etmek zorunda kalmamaları

    }
}
