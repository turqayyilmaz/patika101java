import java.util.Scanner;

public class burcbulma {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        int ay,gun;
        String burc="";
        System.out.print("Doğduğunuz ayı giriniz:");
        ay=input.nextInt();
        System.out.print("Doğduğunuz günü giriniz:");
        gun=input.nextInt();

        if(ay==1)
            burc= gun<=21 ? "Oğlak" : "Kova";

        if(ay==2)
            burc= gun<=19 ? "Kova" : "Balık";

        if(ay==3)
            burc= gun<=20 ? "Balık" : "Koç";
        if(ay==4)
            burc= gun<=20 ? "Koç" : "Boğa";
        if(ay==5)
            burc= gun<=21 ? "Boğa" : "İkizler";
        if(ay==6)
                burc= gun<=22 ? "İkizler" : "Yengeç";
        if(ay==7)
            burc= gun<=22 ? "Yengeç" : "Aslan";
        if(ay==8)
            burc= gun<=22 ? "Aslan" : "Başak";
        if(ay==9)
            burc= gun<=22 ? "Başak" : "Terazi";
        if(ay==10)
            burc= gun<=22 ? "Terazi" : "Akrep";
        if(ay==11)
            burc= gun<=21 ? "Akrep" : "Yay";
        if(ay==12)
            burc= gun<=21 ? "Yay" : "Oğlak";


        System.out.print(burc+" Burcu");
    }
}
