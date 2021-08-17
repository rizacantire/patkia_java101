import java.util.Scanner;

public class SayiKatlari {
    public static void main(String[] args) {
        int sayi,kat1 = 0,kat2=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();

        System.out.println("4'ün katları");

        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println(4 + "^" + kat1 + " = " + i);
            kat1++;
        }

        System.out.println("5'in katları");

        for (int j = 1; j <= sayi; j *= 5) {
            System.out.println(5 + "^" + kat2 + " = " + j);
            kat2++;
        }
    }
}
