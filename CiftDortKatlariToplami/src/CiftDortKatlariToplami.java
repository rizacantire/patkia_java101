import java.util.Scanner;

public class CiftDortKatlariToplami {
    public static void main(String[] args) {
        int sayi,toplam = 0;
        Scanner scanner = new Scanner(System.in);
        sayi = scanner.nextInt();
        System.out.print("lütfen bir sayı giriniz: ");

        while (sayi%2!=1) {
            sayi = scanner.nextInt();
            if(sayi%2==0 & sayi%4==0){
                toplam += sayi;
            }
        }
        System.out.println("Toplam = "+toplam);
    }
}
