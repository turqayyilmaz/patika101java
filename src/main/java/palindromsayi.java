import java.util.Scanner;

public class palindromsayi {


    public static boolean isPalindrom(int sayi){

        int temp=sayi;
        int reverse=0;

        while(temp>0){
            reverse=reverse*10+temp%10;
            temp /=10;
        }
        return reverse==sayi;
    }
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz:");
        int sayi = scan.nextInt();

        if(isPalindrom(sayi))
                System.out.print(sayi + " bir palindrom sayısıdır.");
        else
            System.out.print(sayi + " bir palindrom sayı değildir.");


    }
}
