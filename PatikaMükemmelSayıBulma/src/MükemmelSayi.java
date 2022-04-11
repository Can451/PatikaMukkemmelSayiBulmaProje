import java.util.Scanner;

public class MükemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int girilenSayi;
        int toplam=0;


        System.out.println("Sayi giriniz: ");
        girilenSayi = inp.nextInt();

        for (int k=1; k<girilenSayi;k++){
            if (girilenSayi%k==0){
                toplam+=k;

            }
        }
        if (girilenSayi==toplam){
            System.out.println("Mükemmel sayıdır: "+girilenSayi);
        }
        if(girilenSayi!=toplam){
            System.out.println("Mükemmel sayı değildir: "+girilenSayi);
        }
    }
}
