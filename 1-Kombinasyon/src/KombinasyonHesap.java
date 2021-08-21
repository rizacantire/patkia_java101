import java.util.Scanner;

public class KombinasyonHesap {
    public static void main(String[] args) {
        int bir,iki,faktor = 1,kombin = 1,son,kombinson= 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        bir = scanner.nextInt();
        System.out.print("İkinci Sayı giriniz : ");
        iki = scanner.nextInt();

        son = bir - iki;
        for(int i = 1 ; i<=bir; i++){
            faktor = faktor * i;
        }
        for(int j = 1 ; j<=iki; j++){
            kombin = kombin * j;
        }

        for(int k = 1 ; k<=son; k++){
            kombinson = kombinson * k;
        }


        int sonuc = faktor / (kombin*(kombinson));
        System.out.println("Sonuç : "  +sonuc);

    }
}
