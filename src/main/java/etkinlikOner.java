import java.util.Scanner;

public class etkinlikOner {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Bugün hava kaç derece: ");
        double havaDurumu=input.nextDouble();

        switch ((int) Math.floor(havaDurumu/5)){
            case 0: System.out.print("Bugün kayak yapabilirsiniz."); break;
            case 1:
            case 2: System.out.print("Bugün sinemaya gidebilirsiniz."); break;
            case 3:
            case 4:
            case 5:System.out.print("Bugün pikniğe gidebilirsiniz."); break;
            default : System.out.print("Bugün yüzemeye gidebilirsiniz.");
        }
    }
}
