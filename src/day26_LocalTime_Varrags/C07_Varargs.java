package day26_LocalTime_Varrags;

public class C07_Varargs {
    public static void main(String[] args) {
        //verilen iki sayiyi toplayıp yazdiran method olusturun
        topla(3,6);
        topla(3,5,8);

    }
    public static void topla(int a,int b){
        System.out.println(a+b);
    }
    public static void topla(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void topla(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }


}
