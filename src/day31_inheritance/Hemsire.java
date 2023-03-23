package day31_inheritance;

public class Hemsire extends FMuhasebe{
    String unvan="Hemsire";
    public void standartMaas(){
        System.out.println("Hemsireler min 10 bin tl maas alır");

    }
    public void ozelSigorta(){
        System.out.println("Hemsireler aylik 300 tl katkı ile ozel sigorta yaptırabilir");
    }
    public void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*200);
    }

    public static void main(String[] args) {
        Hemsire hemsire=new Hemsire();
        hemsire.method();
    }

    public void method() {

        System.out.println(this.unvan);  //hemsire
        System.out.println(super.unvan); //personel
        System.out.println(this.sgkNo); //Calisan
        System.out.println(super.sgkNo); //Calisan
        this.standartMaas();
        this.fazlaMesai(3);//600
        super.fazlaMesai(4);//800
        this.ozelSigorta();//aylık 300
    }
}
