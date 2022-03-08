import java.util.Scanner;

public class armStrong {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int sayi= scanner.nextInt();
        int sonuc=0;
        int basamakSayisi=0;
        int tempSayi=sayi;

        while(tempSayi!=0){
            tempSayi /=10;
            basamakSayisi++;
        }

        tempSayi=sayi;
        while(tempSayi!=0){
            int basamakDegeri = tempSayi%10;
            int basamakKuvveti=1;

            for(int i=0; i<=basamakSayisi; i++)
                basamakKuvveti *=basamakDegeri;
            sonuc +=basamakKuvveti;
            tempSayi /=10;
        }

        if(sayi==sonuc){
            System.out.println(sayi + " sayısı bir Armstrong sayıdır.");
        }
        else {
            System.out.println(sayi + " sayısı bir Armstrong sayısı değildir.");

        }


    }
}
