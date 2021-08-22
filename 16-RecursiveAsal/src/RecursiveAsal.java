import java.util.Scanner;

public class RecursiveAsal {
    public static void main(String[] args) {
        int sayi,sayi2=2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı girin : ");
        sayi = scanner.nextInt();

        System.out.println(asal(sayi,sayi2));

    }
    static String asal(int sayi, int sayi2)
    {
        // Base cases
        if (sayi <= 2)
            return (sayi == 2) ? "Asal Değil" : "Asal";
        if (sayi % sayi2 == 0)
            return "Asal değil";
        if (sayi2 * sayi2 > sayi)
            return "Asal";

        return asal(sayi, sayi2 + 1);
    }

}
