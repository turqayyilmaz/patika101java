import java.util.Scanner;

public class yildiztersucgen {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int basamak= scan.nextInt();


        for(int i=0;i<basamak;i++)
        {
            for(int j=1;j<=basamak*2;j++){
                if(j<=i || j>(basamak*2-i)) System.out.print(" ");
                else if(j>i && j<(basamak*2-i)) System.out.print("*");

            }
            System.out.println();
        }
    }
}
