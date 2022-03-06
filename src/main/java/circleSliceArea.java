import java.util.Scanner;

public class circleSliceArea {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        double pi=3.14;
        double r=0;
        double pie=0;

        System.out.print("Daire yarıçapını giriniz:");
        r=input.nextDouble();
        System.out.print("Daire diliminin merkez açısını giriniz:");
        pie = input.nextDouble();

        double pieArea=pi*r*r*pie/360;

        System.out.println("Daire Diliminin alanı: " +pieArea);

    }
}
