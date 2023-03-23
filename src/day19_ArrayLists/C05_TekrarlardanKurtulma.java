package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_TekrarlardanKurtulma {
    public static void main(String[] args) {
        //verilen bir arrayden tekrar eden sayilari silip
        //her bir elementin sadece bir kez kullanildiği bir hale donusturun

        int[]arr={3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};
        List benzersizElementlerList=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if (!(benzersizElementlerList.contains(arr[i]))){
                benzersizElementlerList.add(arr[i]);
            }
        }
        System.out.println(benzersizElementlerList);
        //istenen listeyi List olarak elde ettik
        //bunu arr ye direk atayamayiz
        arr=new int[benzersizElementlerList.size()];//[0,0,0,0,0,0]
        for (int i = 0; i < arr.length ; i++) {


        }
    }
}
