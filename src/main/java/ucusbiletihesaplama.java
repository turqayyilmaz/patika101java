import java.util.Scanner;

public class ucusbiletihesaplama {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);

        int mesafe, yas, yolculukTipi;

        System.out.print("Mesafeyi KM türünden giriniz: ");
        mesafe=scan.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas=scan.nextInt();

        System.out.print("Yolculuk tipini seçiniz (1=> Tek Yön, 2=> Çift Yön): ");
        yolculukTipi=scan.nextInt();

        if(mesafe>0 && yas > 0 && (yolculukTipi==1 || yolculukTipi==2)){
            double tutar=mesafe*0.10;
            double yasIndirimi=0.0;
            if(yas<12) yasIndirimi=tutar*0.5;
            else if(yas>=12 && yas<24) yasIndirimi=tutar*0.1;
            else if(yas>65) yasIndirimi=tutar*0.2;

            tutar=tutar - yasIndirimi;

            if(yolculukTipi==2) tutar=(tutar*0.8)*2;


            System.out.println("Toplam Tutar: "+tutar+" TL");



        }else{
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}
