package day13_MethodOlusturma;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {
        //verilen bir Stringi tersine cevirip bize  dönduren bir method olusturun

        System.out.println(stringTersineCevir("Java Candir"));
    }
    public static String stringTersineCevir(String metin){
        String tersMetin="";
        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin +=metin.charAt(i);
        }
        return tersMetin;
    }
}
