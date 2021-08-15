import java.sql.SQLOutput;
import java.util.Scanner;

public class GirisEkrani {
    public static void main(String[] args) {
        String user,pass,cevap,newPass,pas1="dev";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        user = scanner.next();

        System.out.print("Şifrenizi giriniz : ");
        pass = scanner.next();

        if(user.equals("patika") && pass.equals(pas1)){
            System.out.println("Sisteme başarılı bir şekilde giriş yapıldı");
        }else {
            if(!pass.equals("dev")){
                System.out.println("Hatalı şifre girdiniz şifrenizi sıfırlamak istermisiniz? E / H : ");
                cevap =scanner.next();
                if(cevap.equals("H")) {
                    System.out.println("Çıkış yapıldı");
                }else {
                    System.out.println("Yeni şifreyi giriniz : ");
                    newPass = scanner.next();
                    if(newPass.equals(pas1)){
                        System.out.println("Hatalı giriş lütfen tekrar deneyin");
                    }else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                }
            }
        }
    }
}
