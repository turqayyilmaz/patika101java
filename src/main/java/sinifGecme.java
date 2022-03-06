import java.util.Scanner;

public class sinifGecme {



    public static void main(String[] args)
    {
        //Matematik, Fizik, Türkçe, Kimya, Müzik

        double mat,fizik,turkce,kimya,muzik,ortalama,toplam=0.0;
        int say=0;
        Scanner input=new Scanner(System.in);


        System.out.print("Matematik notunuzu girin: ");
        mat=input.nextInt();
        if(mat<=100 && mat>=0) {
            toplam += mat;
            say++;
        }

        System.out.print("Fizik notunuzu girin: ");
        fizik=input.nextInt();
        if(fizik<=100 && fizik>=0) {
            toplam += fizik;
            say++;
        }

        System.out.print("Türkçe notunuzu girin: ");
        turkce=input.nextInt();
        if(turkce<=100 && turkce>=0) {
            toplam += turkce;
            say++;
        }

        System.out.print("Kimya notunuzu girin: ");
        kimya=input.nextInt();
        if(kimya<=100 && kimya>=0) {
            toplam += kimya;
            say++;
        }

        System.out.print("Muzik notunuzu girin: ");
        muzik=input.nextInt();
        if(muzik<=100 && muzik>=0) {
            toplam += muzik;
            say++;
        }

        if(toplam/say>55)
            System.out.print("Tebrikler, sınıfı geçtiniz");
        else {
            System.out.print("Ortalamanız: "+(toplam/say));
            System.out.print("Maalesef sınıfta kaldınız.");
        }





    }
}
