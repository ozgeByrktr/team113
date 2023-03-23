package day18_multiDimensionalArray;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {
        //Verilen bir array'da istenen elemanın olup olmadıgını bulunuz.

        int[] arr={4,9,1,5,11,3,7,4,6};

        Arrays.sort(arr);//[1, 3, 4, 4, 5, 6, 7, 9, 11]
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 5));//4
        System.out.println(Arrays.binarySearch(arr, 11));//8
        System.out.println(Arrays.binarySearch(arr, 7));//6
        System.out.println(Arrays.binarySearch(arr, 4));//ilk olani yazdirir.//2
        //arrayda binarySearch methodunun duzgun calısması için öncelikle sort calıstırmalıdır.
        //binarySearch()olmayan elemanı önce arrayde olabilecek sıraya koyar sonra olması gereken sıranın
        // negatif degerini veriyor .bu mantıkla en kucuk elementten daha kucuk butun sayılar için-1
        //en buyuk elementten buyuk olan butun sayılar için de -lenght-1 dondurur.

        System.out.println(Arrays.binarySearch(arr, 2));//-2
        System.out.println(Arrays.binarySearch(arr, 8));//-8
        System.out.println(Arrays.binarySearch(arr, 10));//-9
        System.out.println(Arrays.binarySearch(arr, 20));//-10
        System.out.println(Arrays.binarySearch(arr, -3));//-1

    }

}
