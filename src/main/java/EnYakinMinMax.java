import java.util.Arrays;
import java.util.Scanner;

public class EnYakinMinMax {

    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        Scanner scan= new Scanner(System.in);

        System.out.println("Bir sayı girin:");
        int sayi = scan.nextInt();



        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i : list) {
            if (i > min && i<sayi) {
                min = i;
            }

            if (i < max && i>sayi) {
                max = i;
            }
        }
        System.out.println("Dizi : "+ Arrays.toString(list));
        System.out.println("Girilen sayı : "+ sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);

    }
}
