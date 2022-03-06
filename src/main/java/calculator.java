import java.util.Scanner;

public class calculator {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        double sayi1=input.nextDouble();
        System.out.print("2. Sayıyı giriniz: ");
        double sayi2=input.nextDouble();

        System.out.print("1- Toplama\n2- Çıkarma \n3- Çarpma \n4- Bölme\nİşlem Seçiniz:");
        switch (input.nextInt()){
            case 1: System.out.println(sayi1+sayi2); break;
            case 2: System.out.println(sayi1-sayi2); break;
            case 3: System.out.println(sayi1*sayi2); break;
            case 4: System.out.println(sayi1/sayi2); break;
            default: System.out.println("Hatalı İşlem girdiniz!");
        }
    }
}
