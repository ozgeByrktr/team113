package day05_Increment_Decrement_Concatination;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        //a'nin degerini 1 artirin yeni degerinin olusturacaginiz b variablenina atayin

        int a=20;
        a++;
        int b=a;

        System.out.println("a : "+a+"b :"+b);
        a=20;
        b=a;
        a++;
        System.out.println("a : "+a+"b :"+b);
        // bu işlemleri istersek tek satirda yapabiliriz

        a = 20;
        b = ++a;
        System.out.println("a : " + ++a);

        a=20;
        System.out.println("a :" +--a);

        int sayi= 10;//once arttir,sonra degeri arttirir(preıncrement)

        System.out.println(sayi++);//10
        System.out.println(sayi);//11


        int c= 10;
        int d= c++;//sonra arttir ,once ata
        d = c;

        System.out.println("c :"+ c + "d :" + d );













    }




}
