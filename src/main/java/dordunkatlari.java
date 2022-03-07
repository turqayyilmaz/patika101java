import java.util.Scanner;

public class dordunkatlari {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int sayi=0,toplam=0;
        do{
            System.out.print("Sayı giriniz: ");
            sayi=scan.nextInt();
            if(sayi%4==0){
                toplam +=sayi;

            }
        }while(sayi%2!=1);
        System.out.print("4 ün katı olan sayıların toplamı: "+toplam);
    }
}
