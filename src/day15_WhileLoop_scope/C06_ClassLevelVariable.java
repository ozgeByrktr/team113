package day15_WhileLoop_scope;

public class C06_ClassLevelVariable {

    /*
    Bir class icinde tum method'larin erisebilecegi variable'lar istenirse
    Class Level'da (Class'in icinde ama method'larin disinda ) olusturulmalidir

    1- Class Level'da olusturulan variable'ların scope'u tum class'dır
    2- Class Level'da olusturulan variable'lara deger atanmasa bile
        Java onlar icin tanimlanmis DEFAULT DEGERLER atarlar
    3- Class level'da olusturulan variable'lar static veya instance(static olmayan) olabilir
    4- Static olarak tanimlanan variable'lar tum methodlarda direk kullanılabilir
    5- Method static ise, icerisine static olmayan hicbirsey almaz
     */
    static int sayi=10;
    static String isim;
    static boolean bl;
    static char chr;
    static int in1;
    int in2;
    boolean bl2;

    public static void main(String[] args) {
        System.out.println(sayi);
        System.out.println("String : "+isim);//non primitive turler icin null
        System.out.println("boolean :" +bl);//false
        System.out.println("char :"+ chr);//hiclik
        System.out.println("int :"+ in1);//sayisal turler icin 0
        //System.out.println(bl2);//instance
        staticMethod();
        //staticOlmayanMethod();
    }

    public static void staticMethod(){
        sayi++;
        System.out.println(sayi);//s
        System.out.println(chr);//s
        //System.out.println(in2);//instance
        //System.out.println(bl2);//instance
    }
    public void staticOlmayanMethod(){
        sayi--;
        System.out.println(sayi);//s
        System.out.println(bl);//s
        System.out.println(in2);//instance
        System.out.println(bl2);//instance


    }
}
