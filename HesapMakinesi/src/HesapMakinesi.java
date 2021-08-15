import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double sayi1, sayi2, sonuc;
        int islem;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz :");
        sayi1 = input.nextInt();

        System.out.print("2. Sayıyı giriniz :");
        sayi2 = input.nextInt();

        System.out.println("1 Toplama ");
        System.out.println("2 Çıkarma");
        System.out.println("3 Çarpma ");
        System.out.println("4  Bölme ");
        System.out.print("Yapmak istediğiniz işlem için ilgili sayıyı seçiniz:");

        islem = input.nextInt();

        switch (islem) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.print("Toplama sonucu = " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.print("Çıkarma sonucu = " + sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.print("Çarpma sonucu = " + sonuc);
                break;
            case 4:
                if (sayi2 == 0) {
                    System.out.print("Bir sayı sıfıra bölünemez");
                    break;
                } else {
                    sonuc = sayi1 / sayi2;
                    System.out.print("Bölme sonucu = " + sonuc);
                    break;
                }
            default:
                System.out.print("Bir işlem seçiniz");
                break;
        }
    }
}
