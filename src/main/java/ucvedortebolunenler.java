import java.util.Scanner;

public class ucvedortebolunenler {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi=scan.nextInt();
        int say=0;
        int toplam=0;
        for(int i=0;i<=sayi;i++){
            if(i%12==0){
                say++;
                toplam += i;
            }

        }
        System.out.print("0'dan "+sayi+"' a/e kadar olan sayılardan 3 ve 4 e bölünen sayıların ortalaması:"+(toplam/say));
    }
}
