package day19_ArrayLists;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {


        //Soru 2- Verilen 2 katli bir array'de
        //  ayni index'e sahip elementleri toplayip,
        //  yeni olusturacagimiz tek katli bir array'e bu toplamlari atayin.
        // input : int[][] arr =  {{3,4,5}, {2,3,6,7}};
        // output:  [5, 7, 11]
        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7},{2,3}};

        //ortak indeks için en kisa olani bulmaliyiz

        int enkisaArrayLength=arr[0].length;

        for (int i = 0; i < arr.length ; i++) {
           if( arr[i].length<enkisaArrayLength){
               enkisaArrayLength=arr[i].length;
           }
        }//toplamlari koymak için bir array olusturalım
        int[]toplamlarArrayi=new int[enkisaArrayLength];//[0,0,0][5,7,11]olacak
        int indexElemanlarToplami=0;
        for (int i = 0; i < toplamlarArrayi.length ; i++) {
        //kaçtane inher array varsa onlari gezicek
            for (int j = 0; j <arr.length ; j++) {
                indexElemanlarToplami+=arr[j][i];
            }
            toplamlarArrayi[i]=indexElemanlarToplami;
            indexElemanlarToplami=0;
        }
        System.out.println(Arrays.toString(toplamlarArrayi));
    }
}
