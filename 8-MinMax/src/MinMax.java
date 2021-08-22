import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int adet, sayi,max = 0,min=0;
        System.out.print("Kaç sayı girilecek  : ");
        adet = scanner.nextInt();

        for (int i = 1;i <= adet; i++){
            System.out.print("Sayı girin ");
            sayi = scanner.nextInt();

            if (i == 1) {
                max = sayi;
                min = sayi;
            }

            if (sayi > max) {
                max = sayi;
            }

            if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("En Büyük : " + max);
        System.out.println("En Küçük : " + min);
    }
}
