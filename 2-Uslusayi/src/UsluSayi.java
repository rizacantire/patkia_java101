import java.util.Scanner;
import java.util.SortedMap;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,sonuc = 1;

        System.out.print("İlk değer : ");
        a = scanner.nextInt();

        System.out.print("İkinci değer : ");
        b = scanner.nextInt();

        for (int i = 1;i<=b;i++){
            sonuc *= a;
        }

        System.out.println("Üs sonucu : " + sonuc);
    }
}
