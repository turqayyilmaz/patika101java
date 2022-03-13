import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("fibonacci eleman sayısı: ");
        int N= scan.nextInt();

        int n1=0,n2=1,n3;

        for(int i = 2;i<N;i++){
            n3=n1+n2;
            System.out.println(n1 +" + "+n2+" = "+n3);

            n1=n2;
            n2=n3;
        }



    }
}
