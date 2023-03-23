package day29_Inheritance;

public class C04_Child extends C03_ParentClass{

    int c=20;

    int a;
    String s="Child class";
    String m;

    public static void main(String[] args) {
        C03_ParentClass objC03=new C03_ParentClass();
        objC03.a=20;
        objC03.b=22;
        objC03.s="p";
        objC03.t="k";
        objC03.method1();
        objC03.method2();
        /*
        Java'da parent classlar child edinmez
        child classlar parent edinir.
        Bir classın baska bir classdaki tum ozellikleri otomatik olarak edinmesini istiyorsan classımızı extends keyword
        ile o classa child yapariz.(sizi parent yaptım :))
         */
        C04_Child objC04=new C04_Child();
        objC04.a=50;
        objC04.c=20;
        objC04.s="u";
        objC04.m="l";
        objC04.method1();

        }
    }


