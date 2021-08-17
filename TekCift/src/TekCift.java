import java.util.Scanner;

public class TekCift {
    public static void main(String[] args) {

        int sayi, toplam = 0, bolen = 0, ortalama;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = scanner.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("3 ve 4 e bölünebilme");

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = scanner.nextInt();

        for (int j = 0; j <= sayi; j++) {
            if (j % 3 == 0 & j % 4 == 0) {
                System.out.println(j);
                bolen++;
                toplam += j;
            }
        }
        ortalama = toplam / bolen;

        System.out.println("Ortalama: " + ortalama);
    }
}
