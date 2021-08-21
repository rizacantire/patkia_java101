import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        double n, toplam = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Harmonik sayı giriniz : ");
        n = input.nextInt();

        for (double i = 1; i <= n; i++) {
            toplam += (1 / i);
        }
        System.out.print("Cevap: " + toplam);
    }
}
