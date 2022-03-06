import java.util.Scanner;

public class bmi {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        double boy=3.14;
        double kilo=0;
        double bmi=0;

        System.out.print("Boyunuzu giriniz:");
        boy=input.nextDouble();
        System.out.print("Kilonuzu giriniz:");
        kilo= input.nextDouble();


        bmi=kilo/(boy*boy);
        System.out.println("Vucut Kitke Endeksiniz: " +bmi);

    }
}
