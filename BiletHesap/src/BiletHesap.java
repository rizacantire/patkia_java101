import java.util.Scanner;

public class BiletHesap {
    public static void main(String[] args) {
        int mesafe,yas,yon;
        double ucret = 0.10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafayi km olarak giriniz : ");
        mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = scanner.nextInt();

        System.out.print("Yolcuk tipini seçininiz : (1 - tek yön / 2 - Gidiş Dönüş) ");
        yon = scanner.nextInt();
        double odeme = mesafe*ucret;
        if(yas<12){
            odeme = odeme/2;
            System.out.println("Toplam tutar : " +odeme);
        }else if(yas<24){
            odeme = odeme*0.90;
            System.out.println("Toplam tutar : " +odeme);
        }else if (yas > 65){
            odeme = odeme*0.70;
            System.out.println("Toplam tutar : " +odeme);
        }else {
            System.out.println("Toplam tutar : " +odeme);
        }

        if(yon == 1){
            System.out.println("Toplam tutar : " +odeme );

        }else if (yon == 2){
            System.out.println("Toplam tutar : " +odeme *2 );
        }else{
            System.out.println("Hatalı işlem gerçekleştirdiniz.");
        }
    }
}
