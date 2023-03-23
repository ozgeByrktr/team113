package day30_inheritance;

public class CToyotaCorolla extends BToyota {
    String lastik="Lassa 205-55-15";
    String model="Corolla";
    String yakit="Corolla disel,benzin ve elektrikli araclardir";
    public void motor(){
        System.out.println("Corolla arabalar Turkiye'de uratilen motor kullanır.");
    }
    public void uretimYeri(){
        System.out.println("Corolla marka arabalar Turkiye'de uretilir.");
    }


    public static void main(String[] args) {
        CToyotaCorolla corolla=new CToyotaCorolla();
        System.out.println(corolla.lastik);
        System.out.println(corolla.aku);
        System.out.println(corolla.model);
        System.out.println(corolla.marka);
        System.out.println(corolla.yakit);
        corolla.uretimYeri();
        corolla.motor();
        corolla.guvenlik();
        System.out.println(corolla.vites);

    }
}
