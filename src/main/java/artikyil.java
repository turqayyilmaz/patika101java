import java.util.Scanner;

public class artikyil {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int yil= scan.nextInt();

        if(yil%4==0 || yil%400==0)
        {
            System.out.println(yil+ " bir artık yıldır !");
        }
        else{
            System.out.println(yil+ " bir artık yıl değildir !");
        }

    }
}
