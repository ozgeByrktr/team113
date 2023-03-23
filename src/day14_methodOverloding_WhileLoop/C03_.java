package day14_methodOverloding_WhileLoop;

public class C03_ {
    public static void main(String[] args) {
        //bir classda ayni isme sahip farkli islem yapan methodlar olabilir
        //java hangisinin calısacagına "Parametrelere" göre karar verir.
        //isim aynı parametreleri farkli methodlar olmasına Method OVERLOADING denir.

        String str="Bu is olacak";
        System.out.println(str.replace("Bu is", "Java guzel"));

        System.out.println(str.replace('u', 'e'));

    }
}
