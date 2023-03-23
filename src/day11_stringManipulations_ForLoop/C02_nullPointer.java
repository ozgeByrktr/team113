package day11_stringManipulations_ForLoop;

public class C02_nullPointer {
    public static void main(String[] args) {

        //null bir deger degildir
        // null bir pointer'dir, yanina yazildigi non-primitive variable'a deger atanmadigini isaret eder

        String str;  // str olusturuldu ama deger atanmadi

        // Java method icerisinde deger atamadan variable olusturulmasina izin verir
        // ama deger atamadan kullanilmasina izin vermez

        //System.out.println(str);// str oluşturuldu ama deger atanmadi
        // java method icerisinde deger atamadan variable olusturulmasina izin verir
        //ama deger atamadan kullanmamıza izin vermez
        //sout(str); CTE
        //str.concat("Java"); CTE

        str=null; //sadece nullpointerdir,null olarak işaretlenmiş deger atanmamis

        System.out.println(str);//null
       // System.out.println(str.concat("java"));//run time error
       // System.out.println(str.length());//RTE
        System.out.println(str+"Java");//nullJava
        String str2=str +"Java";
        System.out.println(str2);//nullJava

        String str3="";//hiçlik degeri atanmistir

        //System.out.println(str.isEmpty());//NullPointerExeption
        //null olarak isaretlenmis bir String hicbir methodla kullanilamaz.
        //sadece yazdırılabilir veya + ile kullanilabilir.




    }
}
