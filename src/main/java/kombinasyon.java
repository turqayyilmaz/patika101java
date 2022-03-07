import java.util.Scanner;

public class kombinasyon {
    public static int faktoriyel(int n){
        if(n==1) return 1;

        return n*faktoriyel(n-1);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını girin: ");
        int n = scan.nextInt();

        System.out.print("Kaç elemanlı kombinasyon: ");
        int r = scan.nextInt();
        int kombinasyon= faktoriyel(n)/(faktoriyel(r)*(faktoriyel(n-r)));

        System.out.print("C("+n+","+r+")="+kombinasyon);



    }
}
