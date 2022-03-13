import java.util.Scanner;

public class RecursivePattern {
    public static void recursivePattern(int n, int m,int x)
    {
        System.out.print(m + " ");

        if(x==5 && m==n) return;

        m=m+x;

        x= (m<=0)?x*(-1):x;

        recursivePattern(n,m,x);
    }
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi= scan.nextInt();

        recursivePattern(sayi,sayi,-5);
    }
}
