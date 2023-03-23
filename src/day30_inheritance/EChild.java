package day30_inheritance;

public class EChild extends DParentAccessModifier {
    static int sayiChildStatic;

    public static void main(String[] args) {
        EChild eChild = new EChild();
        // İnheritance da private class uyeleri inherit edilemez.
        // icinde bulundugumuz classdaki static variableller
        // obje uzerinden otomatik gelmez
        // ama java manuel yazıldıgında kabul eder.
        // ancak parent classdaki static variableler
        // obje uzerinden kullanilamaz!!

        System.out.println(eChild.sayiDefault);
        System.out.println(eChild.sayiProtected);
        System.out.println(eChild.sayiPublic);
        System.out.println(DParentAccessModifier.sayiStaticDefault);

        // bu kullanım icin inheritancea ihtiyac yok
        // herhangi bir class da ki static variable i
        // classİsmi.staticVariableIsmı seklinde kullanabiliriz!!!!

        System.out.println(eChild.sayiChildStatic);
    }
}
