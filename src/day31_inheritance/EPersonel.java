package day31_inheritance;

public class EPersonel {

    String isim="personel isim belirtilmemiş";
    String unvan=" personel unvan belirtilmemis";
    boolean izindeMi;
    int maas;
    public void standartMaas(){
        System.out.println("Personel asgari ucreti : "+8500);

    }
    public void ozelSigorta(){
        System.out.println("Personelden katki payi alinarak ozel sigorta yapilir.");
    }
}
