import java.util.Scanner;

public class harmoniksayilar {
    public static void main(String[] args)
    {
        Scanner io= new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n= io.nextInt();
        double result=0;
        for(double i=1;i<=n;i++)
        {
            result += 1/i;
        }

        System.out.println("Harmonik toplam: "+result);
    }
}
