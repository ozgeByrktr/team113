package day26_LocalTime_Varrags;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2023-03-09

        System.out.println(tarih.isLeapYear());//artık yıl mı diye bakar
        LocalDate tarih2=LocalDate.of(2222,10,10);
        System.out.println(tarih2.isLeapYear());
        System.out.println(tarih.plusWeeks(20).plusDays(2));
        System.out.println(tarih.minusMonths(3).minusDays(3));
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.plusWeeks(20).plusDays(2)); // 2023-07-29
        System.out.println(tarih.minusMonths(3).minusDays(3)); // 2022-12-06
        System.out.println(tarih.withYear(1923).withMonth(5)); // 1923-05-09
        System.out.println(tarih.getDayOfYear()); // 68
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.getMonth());
        LocalDate tarih3=LocalDate.of(1987,12,8);
        System.out.println(tarih3.getDayOfWeek());//Tuesday
        System.out.println(tarih.isBefore(tarih3));
        System.out.println(tarih.isAfter(tarih3));
    }
}
