import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1 = 0, sayi2 = 1, sayi3, i, n;
        System.out.print("İk Sayıyı Girin:");
        n = scanner.nextInt();
        System.out.print(sayi1 + " " + sayi2);

        for (i = 2; i <= n; ++i)
        {
            sayi3 = sayi1 + sayi2;
            System.out.print(" " + sayi3);
            sayi1 = sayi2;
            sayi2 = sayi3;
        }
        System.out.println();
    }
}
