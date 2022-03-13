import java.util.Scanner;

public class RecursivePrime {

    public static boolean recursivePrime(int number,int n)
    {
        if(n==1) return true;

        if(number%n==0) return false;

        return recursivePrime(number,n-1);

    }

    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.print("Bir sayı girin:");
        int sayi= scan.nextInt();

        if(recursivePrime(sayi,sayi-1)){
            System.out.print(sayi+" sayısı bir asal sayıdır.");
        }
        else{
            System.out.print(sayi+" sayısı bir asal sayı değildir.");
        }


    }
}
