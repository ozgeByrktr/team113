package day37_Exeptions;

public class C03_ClassCastExceptions {
    public static void main(String[] args) {
        String str= "25";

        // str'a sayisal olarak 5 ekleyip yazdirin

        System.out.println(Integer.parseInt(str)+5);

        // eger str icinde sayi olmayan bir karakter olursa NumberFormatException


        Object sayiObj= str;

        Integer sayiInt= (Integer)sayiObj;

        System.out.println(sayiInt); // ClassCastException
    }
}
