package day32_inheritance_dataTypeKullanimi;

public class HAvciKuslar extends GKuslar {
    public void hareket(){
        System.out.println("ucarlar");
    }
    public void beslenme(){
        System.out.println("et yerler");
    }
    public void pence(){
        System.out.println("pencelidir");
    }
    public void gaga(){
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
        HAvciKuslar kartalAvci=new HAvciKuslar();
        kartalAvci.hareket();//H ucarlar
        kartalAvci.beslenme();//H et yerler
        kartalAvci.pence();//H pencelidir
        kartalAvci.gaga();//H sivri gaga
        kartalAvci.kanat();//G kanatlidir
        kartalAvci.solunum();//G akciger
        kartalAvci.cogalma();//G yumurta
        kartalAvci.omur();//F yasar ve olurler

        /*
        Ozellikler method olarak olusturulmus ise data turu ve Cons aynı ise
        o classtan aramaya baslarım. buldugum ilk degeri atarım
         */
        GKuslar kuslar=new GKuslar();
        //artık biz kuslar classina gidicez alt classı yok
        kuslar.hareket();//F hareket ederler
        kuslar.beslenme();//F beslenirler
        // kuslar.pence();//CTE
        kuslar.gaga();//G gagalari vardır
        kuslar.kanat();//G kanatlidir
        kuslar.solunum();//G akciger
        kuslar.cogalma();//G yumurta
        kuslar.omur();//F yasar ve olurler

        GKuslar kartalKus=new HAvciKuslar();
        //Data turu ile Constructor ayni degilse dinamik olur hersey degisir
        //Data turu olan classtan aramaya baslar
        //o class veya parent classlarında bulamazsa CTE verir.
        //oclass veya parent classlarında bulursa override edilmiş mi kontrol eder
        //ve en guncel bilgiyi bulup yazdırır.
        kartalKus.hareket();//H
        kartalKus.beslenme();//H
       // kartalKus.pence();//CTE
        kartalKus.gaga();//H
        kartalKus.kanat();//G kanatlidir
        kartalKus.solunum();//G akciger
        kartalKus.cogalma();//G yumurta
        kartalKus.omur();//F yasar ve olurler

        FHayvanlar hayvanlar=new FHayvanlar();
        //Const ve Data ayni oldugu için dire F classına gider.
        hayvanlar.hareket();
        hayvanlar.beslenme();
        hayvanlar.solunum();
        hayvanlar.omur();
        hayvanlar.cogalma();
        //hayvanlar.gaga();
        //hayvanlar.kanat();
        //hayvanlar.pence();



    }
}
