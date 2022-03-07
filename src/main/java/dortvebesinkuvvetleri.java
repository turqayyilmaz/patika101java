import java.util.Scanner;

public class dortvebesinkuvvetleri {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Sınır sayıyı girin: ");
        int sayi=scan.nextInt();
        int dortkuvveti=4;
        int beskuvveti=5;
        for(int i=1;i<=sayi; i++)
        {
            if(Math.pow(4,i)<=sayi){
                System.out.print("4^"+i+"="+Math.round(Math.pow(4,i)));

            }else{
                break;
            }
            if(Math.pow(5,i)<=sayi)
                System.out.print("\t5^"+i+"="+Math.round(Math.pow(5,i)));
            System.out.println();


        }
    }
}
