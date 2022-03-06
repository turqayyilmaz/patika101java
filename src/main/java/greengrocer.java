import java.util.Scanner;

public class greengrocer {
    public static void main(String[] args){
        /*
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        Örnek Çıktı;

        Armut Kaç Kilo ? :0
        Elma Kaç Kilo ? :1
        Domates Kaç Kilo ? :1
        Muz Kaç Kilo ? :2
        Patlıcan Kaç Kilo ? :3
        Toplam Tutar : 21.68 TL

         */

        Scanner input= new Scanner(System.in);

        double armut=2.14, elma=3.67, domates=1.11,muz=0.95,patlican=5.00;
        double kgArmut,kgElma,kgDomates,kgMuz,kgPatlican;

        System.out.print("Armut kaç kilo: ");
        kgArmut=input.nextDouble();

        System.out.print("Elma kaç kilo: ");
        kgElma=input.nextDouble();

        System.out.print("Domates kaç kilo: ");
        kgDomates=input.nextDouble();

        System.out.print("Muz kaç kilo: ");
        kgMuz=input.nextDouble();

        System.out.print("Patlıcan kaç kilo: ");
        kgPatlican=input.nextDouble();

        double total= kgArmut*armut+kgDomates*domates+kgElma*elma+kgMuz*muz+kgPatlican*patlican;

        System.out.println("Ödenecek tutar: "+total);





    }
}
