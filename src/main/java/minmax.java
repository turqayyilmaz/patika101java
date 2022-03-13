import java.util.Scanner;

public class minmax {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz?: ");
        int N = scan.nextInt();
        int min=Integer.MAX_VALUE,
                max=Integer.MIN_VALUE;
        int i=1;
        while(N>0) {
            System.out.print(i+". sayıyı giriniz: ");
            int sayi= scan.nextInt();

            if(sayi>max) max=sayi;
            if(sayi<min) min=sayi;
            i++;
            N--;
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}
