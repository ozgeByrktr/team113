package day26_LocalTime_Varrags;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime saat=LocalTime.of(20,15);
        System.out.println(saat);

        LocalTime saat1=LocalTime.now();
        System.out.println(saat1);
        //Local time objesi olan saat variable'i canlı bir saat degildir
        //olusturuldugu andaki Local time'i sistemden alıp kaydettiğimiz sabit degerdir.
        //kodun ilerleyen kısmında ne kadar süre gectiğini görmek için saati
        // yeniden görmek için yeni bir local time objesi daha olusturmalıyız.
        System.out.println(saat1.getHour());//20:56
        //get methodları local time objesinin saat dk sn ve nano degerlerini bize getirir.
        saat1.plusHours(2).plusMinutes(10);
        System.out.println(saat1);
        System.out.println(saat1.withSecond(10).withNano(20));

        int toplam=0;
        for (int i = 0; i <10000000 ; i++) {
            toplam++;
        }
        System.out.println(saat1.minusMinutes(10).minusSeconds(10));
        System.out.println(saat.compareTo(saat1)); // ayni ise 0 doner
        System.out.println(saat1.compareTo(saat));
        System.out.println(saat1.isAfter(saat));
        System.out.println(saat1.isBefore(saat));
        System.out.println(saat1.toSecondOfDay());
        System.out.println(saat1.plusHours(2).plusMinutes(10));

    }
}
