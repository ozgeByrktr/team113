package day30_inheritance;

public class BToyota extends Araba {
    String marka ="Toyota";
    String aku="Inci aku";
    String lastik="Bridgestone";

    public void motor(){
        System.out.println("Toyotalar cevreci motorlar kullanir.");
    }
    public  void guvenlik(){
        System.out.println("Toyotalar parmak izi okuyucu ile calısır");
    }

}
