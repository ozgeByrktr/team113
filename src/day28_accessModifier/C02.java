package day28_accessModifier;

public class C02 {
    public static void main(String[] args) {
       // System.out.println(C01_.c);
        //System.out.println(C01_.b);  access modifier private!!!!!

        C01 obj=new C01();

        obj.str="tava";
        C01.s="TAVA";
        C01.a=50;
        obj.d=40;
    }
}
