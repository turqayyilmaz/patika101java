import java.util.Scanner;

public class taximeter {
    public static void main(String[] args){
        float startPrice=10.0f;
        float pricePerKm=2.20f;
        int km=0;
        Scanner input= new Scanner(System.in);
        System.out.print("Gidilen KM yi giriniz:");
        km = input.nextInt();
        double totalPrice=0;
        totalPrice= pricePerKm*km + startPrice;
        totalPrice= totalPrice>20?totalPrice : 20.00;
        System.out.print("Ödenecek Tutar:" + totalPrice);
    }
}
