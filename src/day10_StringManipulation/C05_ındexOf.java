package day10_StringManipulation;

public class C05_ındexOf {
    public static void main(String[] args) {

        String str="Java cok ama cok guzel";

        System.out.println( str.indexOf("c"));//5

        System.out.println(str.indexOf("a"));//1
        //birden fazla ise ilk buldugunu verir.

        System.out.println(str.indexOf("cok"));//5

        System.out.println(str.indexOf("cok",6));//13
        System.out.println(str.indexOf("cok",5));//5

        System.out.println(str.indexOf("java"));//-1 aranan string yoksa hep -1 döner.

        // verilen bir cumlede, istenen bir String icin
        //asagıdaki cumlelerden uygun olanı yazdırın
        //1-Aradıgınız kelime cumlede 1 kere kullanılmıs
        //2-aradıgınız kelime cumlede 2 kere kullanılmıs
        //3-aradıgınız kelime cumlede 2'den fazla kullanılmıs
        //4-aradiginiz kelime cumlede hic kullanilmamis

        String cumle="Yasasin java, iyi ki java ogreniyorum, java";
        String kelime= "java";
        int kelimeKullanimSayisi=0;

        if (cumle.indexOf(kelime)==(-1)){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        }else {
            int kelimeIlkIndex= cumle.indexOf(kelime);//8
            if (cumle.indexOf(kelime,(kelimeIlkIndex+1))==(-1)){
                System.out.println("Aradıgınız kelime cumlede 1 kere kullanılmıs");
            }else {
                int ikinciKelimeIndex=cumle.indexOf(kelime,(kelimeIlkIndex+1));
                if (cumle.indexOf(kelime,(ikinciKelimeIndex))==(-1)){
                    System.out.println("aradıgınız kelime cumlede 2 kere kullanılmıs");
                }else {
                    System.out.println("aradıgınız kelime cumlede 2'den fazla kullanılmıs");
                }
            }
        }

    }
}
