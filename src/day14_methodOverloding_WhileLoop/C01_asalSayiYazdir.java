package day14_methodOverloding_WhileLoop;

public class C01_asalSayiYazdir {
    public static void main(String[] args) {
        //verilen pozitif bir tamsayinin
        //asal olup olmadiğini yazdiran bir method oluşturun


            asalMıYazdir(23);





    }
    public static void asalMıYazdir(int sayi){
        int flag=0;

        for (int i = 2; i <sayi ; i++) {

            if (sayi % i == 0) {
                flag++;
                break;
            }
        }
        if (sayi == 2) {
            System.out.println("Girilen 2 sayisi ASAL bir sayidir");
        } else if(flag==0){
                System.out.println("Girilen "+ sayi+ " sayisi Asal bir sayidir.");

            }else{
                System.out.println("Girilen "+ sayi+ " sayisi Asal bir sayi degildir.");
            }

        }
    }

