import java.util.Scanner;

public class basamakDegerleriToplami {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int sayi= scanner.nextInt();
        int sonuc=0;
        String str=sayi+" = ";
        int tempSayi=sayi;

        while(tempSayi!=0){
            sonuc += tempSayi%10;
            str +=" "+tempSayi%10+" +";
            tempSayi /=10;


        }

        str =str.substring(0,str.length()-1)+"= "+sonuc;
        System.out.println(str);




    }
}
