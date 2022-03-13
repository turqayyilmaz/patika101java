import java.util.Scanner;

public class recursiveUs {

    public static int recursiveUs(int base,int pow){
        if(pow==0)
        return 1;

        return base*recursiveUs(base,pow-1);

    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz:");
        int base= scan.nextInt();
        System.out.print("Üssü  giriniz:");
        int pow= scan.nextInt();
        System.out.print(base+"^"+pow+" = "+ recursiveUs(base,pow));
    }
}
