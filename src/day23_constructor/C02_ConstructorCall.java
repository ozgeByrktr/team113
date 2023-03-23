package day23_constructor;

public class C02_ConstructorCall {
    //Java'da ihtiyac olursa bir constructor icinden baska constructor cagırılabilir.
    //this(içinde ilgili parametreler)yazarak istedigimiz contructor'ı cagirabiliriz
    //Constructor icin 2 kural vardır:
    //1-Constructor call icinde bulundugu constructor'ın ilk satırında olmalıdır.
    //2-
    int sayi;
    String str;


    public C02_ConstructorCall(int sayi, String str) {
        this();//Java syntax olarak constructor call icin bunu belirlemistir.
        this.sayi = sayi;
        this.str = str;
        System.out.println("İki parametreli const calisti");
    }

    public C02_ConstructorCall(String str) {
        this(5);
        System.out.println("String parametreli constructor calisti");
        this.str = str;
    }

    public C02_ConstructorCall(int sayi) {
        System.out.println("int parametreli contructor calıstı");
        this.sayi = sayi;
    }

    public C02_ConstructorCall() {
        System.out.println("parametresiz constructor calıstı");
    }

    public static void main(String[] args) {
        C02_ConstructorCall obj1 = new C02_ConstructorCall();
        C02_ConstructorCall obj2 = new C02_ConstructorCall("Java");
        System.out.println(obj2.sayi);
        System.out.println(obj2.str);
        C02_ConstructorCall obj3 = new C02_ConstructorCall(7, "Selçuk");
        System.out.println(obj3.sayi);
        System.out.println(obj3.str);
    }
}
