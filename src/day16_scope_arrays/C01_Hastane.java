package day16_scope_arrays;

public class C01_Hastane {
    public static void main(String[] args) {

        ADoktor dok1=new ADoktor();
        System.out.println(dok1.askerlik);//false
        dok1.isim="Kemal";
        dok1.soyisim="YILMAZ";
        dok1.dogumyili=1980;

        System.out.println(dok1.isim);


        ADoktor dok2=new ADoktor();
        System.out.println(dok2.isim);//null
        dok2.soyisim="Celik";
        System.out.println(dok2.soyisim);//celik

        System.out.println(dok1);//referansini yazdirir
        System.out.println(dok1.fakulte);
        System.out.println(dok2.fakulte);
        dok1.isim="Burcu";
        System.out.println(dok2.isim);//null

        dok1.fakulte="Tip Fakultesi";
        System.out.println(dok2.fakulte);

        /*
        dr ismi instance objeden objeye degisir
        fakulte static butun tıp olanların degeri 26. satırdan itibaren
         Tıp Fakultesi olur

         */
        ADoktor dok3=new ADoktor();
        System.out.println(dok3.dogumyili);//0
        System.out.println(dok3.fakulte);//Tıp Fakultesi
        System.out.println(ADoktor.fakulte);
        //Static variablelar için erişim yöntemi
        // classiİsmi.staticUyeİsmi seklinde yazımdır
        //bu kullanım biçimine static yöntem denir.
    }
}
