package day39_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueue {
    public static void main(String[] args) {
        Queue<String>q1=new LinkedList<>();
        q1.add("H");
        q1.add("Y");
        q1.offer("K");//offer eleman sayısı ile ilgili sınırlama varsa ekleme yapmaz hata verir.Exception fırlatır.
        //kapasite sınırı yoksa add ile aynı işlevi görür.
        System.out.println(q1.remove());//Queue eklemeyi sona yapıp kullanmayı bastan yaptıgı için parametre girilmezse
        // bastaki elemanı remove eder ve bize döndürür.
        System.out.println(q1.poll());//basındaki sayıyı siler ve döndurur.Bossa null döndurur.Exception fırlatmaz.
        System.out.println(q1.peek());//silmeden bastaki elementi getirir.bos ise null getirir.
        System.out.println(q1.element());//bastaki elemanı getirir ama bossa exception fırlatır.
        System.out.println(q1);
    }
}
