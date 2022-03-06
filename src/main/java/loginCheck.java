import java.util.Scanner;

public class loginCheck {
    public static void main(String[] args){

        String uName_="patika";
        String pass="Java123";
        Scanner input= new Scanner(System.in);

        System.out.print("Kullanıcı adınızı girin:");
        String username= input.nextLine();

        System.out.print("Şifrenizi girin:");
        String password= input.nextLine();

        if(username.equals(uName_) && password.equals(pass)) System.out.println("Başarılı şekilde giriş yapıldı.");
        else{
            System.out.println("Şifreniz hatalı. Değiştirmek istermisiniz? (E/H)");
            char ans = input.nextLine().charAt(0);

            if(ans=='E' || ans=='e')
            {
                System.out.print("Yeni şifrenizi giriniz: ");
                String newPassword=input.nextLine();

                if(newPassword.equals(pass)){
                    System.out.println("Şifreniz değiştirilemedi");
                }else{
                    System.out.println("Şifreniz değiştirildi");
                }

            }
            else{

            }


        }

    }


}
