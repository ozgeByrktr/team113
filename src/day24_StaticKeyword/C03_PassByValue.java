package day24_StaticKeyword;

import java.util.Arrays;

public class C03_PassByValue {
    public static void main(String[] args) {
        int[]arr={3,4,5};
        elementleriArttir(arr,4);
        System.out.println(Arrays.toString(arr));
    }
    public static void elementleriArttir(int[]arr,int artisMiktari){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] += artisMiktari ;

        }
        System.out.println("methodda array: "+ Arrays.toString(arr));
    }
}
