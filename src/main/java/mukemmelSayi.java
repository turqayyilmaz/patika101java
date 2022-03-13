import java.util.Scanner;

public class mukemmelSayi {
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);

       System.out.print("Bir sayı giriniz: ");
       int sayi = scan.nextInt();
       int toplam=0;

       for(int i=1;i< sayi ;i++)
           if(sayi % i == 0) toplam += i;

       if(sayi==toplam && sayi!=1) System.out.print(sayi + " Mükemmel Sayıdır.");
       else System.out.print(sayi + " Mükemmel Sayı değildir.");
   }


}
