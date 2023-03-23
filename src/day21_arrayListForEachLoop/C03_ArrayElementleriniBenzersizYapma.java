package day21_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayElementleriniBenzersizYapma {
    public static void main(String[] args) {
        //Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip,
        // tum elemanlardan sadece 1 tane yapip
        // eski array’e yeni halini atayip yazdirin.
       int[]arr={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        List<Integer>benzersizElemanListesi=new ArrayList<>();
        //Arraydaki her bir elementi kontrol edelim yoksa ekleyelim varsa eklemmeyelim

        for (int each: arr
             ) {
            if (!benzersizElemanListesi.contains(each)){
                benzersizElemanListesi.add(each);
            }
        }
        System.out.println(benzersizElemanListesi);
        arr=new int[benzersizElemanListesi.size()];

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= benzersizElemanListesi.get(i);

        }
        System.out.println(Arrays.toString(arr));

    }
}
