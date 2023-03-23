package day09_SwıchStatement_StringManip;

public class C10_length {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";
        System.out.println(str.length()); //30

        //karakter sayisi ile ındex arasinda bir fark olur.

        //cumledeki son karakteri yazdırın.
        System.out.println(str.charAt(str.length()-1));//29. harf (r) gelir.
        //sondan 3. karakter
        System.out.println(str.charAt(str.length()-3));

    }
}
