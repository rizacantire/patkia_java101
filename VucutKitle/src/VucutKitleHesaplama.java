import java.util.Scanner;

public class VucutKitleHesaplama {
    public static void main(String[] args) {
        double boy, kilo,indeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        kilo = input.nextDouble();

        indeks = (kilo / (boy * boy));
        System.out.println("Vücut kitle indeksiniz : " + indeks);




    }
}