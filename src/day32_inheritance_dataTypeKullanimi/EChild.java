package day32_inheritance_dataTypeKullanimi;

public class EChild extends DParent{
    String str="Child";
    void method1(){ //DParenttaki methodu gecersiz kılan method
        // *(override)*
        System.out.println("Child method 1 ");
    }
    /*
    Override : Gecersiz kılma
    Overriden : gecersiz kilinan
     */

    public static void main(String[] args) {

        EChild childC= new EChild();
        childC.method1();
        System.out.println(childC.str);

        DParent childP= new EChild();
        System.out.println(childP.str);
        childP.method1();

    }
}
