package day31_inheritance;

public class BAraba {
   protected BAraba(){
        System.out.println("Araba parametresiz constructor calıstı");
    }

    protected BAraba (String str){
        System.out.println("Araba str parametreli const calıstı");
    }
    protected BAraba(int a,int b){
        System.out.println("Araba 2 parametreli cons calıstı.");
    }
}
