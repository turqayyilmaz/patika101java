import java.util.Scanner;

public class uslusayi {
    public static void  main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Üssü alınacak sayı:");
        int sayi= scan.nextInt();

        System.out.print("Üs:");
        int us= scan.nextInt();
        int uslusayi=1;
        for(int i=1;i<=us;i++)
            uslusayi *=sayi;

        System.out.print(sayi+"^"+us+"="+uslusayi);

    }
}
