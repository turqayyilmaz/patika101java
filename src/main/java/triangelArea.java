import java.util.Scanner;


public class triangelArea {

    public static void main(String[] args) {
        int a,b,c=0;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz: ");
        a= input.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        b= input.nextInt();
        System.out.print("3. Kenarı giriniz: ");
        c= input.nextInt();

        double u = (a+b+c)/2;

        double area= u*(u-a)*(u-b)*(u-c);

        System.out.println("Üçgenin alanı: " + area);

    }



}
