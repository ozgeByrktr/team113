package day35_interfaces;

public interface I01_interface {

        static int sayi =10;
        final String str="Java Candir";
        public static final boolean b=true;
        // Interface'de tum variable'lar (Yazilmasa bile) public, static ve final'dir
        // final oldugu icin sonradan degistirme imkani yoktur, olustururken deger atanmalidir
        // bu ozellikler standart olarak tum variable'lara tanimlandigindan,
        // bu tanimlamalari yapmak gerekli degildir (intellij gri yapti)
        void toplama();
        public void cikarma();
        abstract String ekleme();
        public abstract int faktoriyel();
        // tum methodlarda standart olarak public ve abstract'tir (yazilmasa bile)
    }

