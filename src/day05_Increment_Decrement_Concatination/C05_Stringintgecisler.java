package day05_Increment_Decrement_Concatination;

public class C05_Stringintgecisler {
    public static void main(String[] args) {
        String s1="423";

        int sayi=Integer.parseInt(s1);
        System.out.println(sayi++);//423
        System.out.println(sayi);//424


        int a=20;
        int b=40;

        System.out.println(a+ "" + b);
        System.out.println("" + a + b);//String strongtur.//2040


    }
}
