package day39_Collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1=new LinkedList<>();

        ll1.add("K");
        ll1.add("T");
        //Linked list uc Interfacei implement etmiştir.
        //List,Queue,Deque
        //dolayısıyla bu interfacelerden sonra gelen ilk concrate class oldugundan bu 3 interface deki
        // tum abstract methodlari override etmistir.
        //Linked List olusturulurken secilen data turune göre bu uc interfaceden birinin ozelliklerini tasir.

        List<String> ll2=new LinkedList<>();

        //Bu sekilde olusturulan Linked list ArrayList ozelliklerini tasır.
        ll2.add("R");
        ll2.add("Z");
        ll2.add(0,"A");//[A,R,Z]
        System.out.println(ll2);
        ll2.addAll(2,ll1);//[A,R,K,T,Z]
        ll2.set(3,"M");
        ll2.add("K");
        ll2.add("T");
        System.out.println(ll2);
        System.out.println(ll2.hashCode());//hafızadaki hashcode degerini verir.
        System.out.println(ll2.get(1));
        System.out.println(ll2.retainAll(ll1));//true//retain=tutmak./List1 elemanlarını tutuyor.
        System.out.println(ll2);//List1 elemanları dısındakileri sildi.
        System.out.println(ll2.subList(2, 4));//index aralıgındaki elemanları arrayde getirir.

    }
}
