package day08_NestedIfElse_Ternary;

public class C07_Ternary {
    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

char harf='m';
        System.out.println(harf>='a' && harf<='z'
                ? Character.toUpperCase(harf)
                : harf);
    }
}
