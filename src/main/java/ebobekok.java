import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int a = scanner.nextInt();


        System.out.print("2. Sayıyı giriniz: ");
        int b = scanner.nextInt();
        int ebob =1;
        int ekok =1;
        int max=(a>b)?a:b;

        while(max>0){
            if(a%max==0 && b%max==0) {
                ebob=max;
                break;
            }
        max--;
        }

        ekok=a*b/ebob;
        System.out.println(a + " ile " + b + " nin EBOB: "+ebob);
        System.out.println(a + " ile " + b + " nin EKOK: "+ekok);

    }
}
