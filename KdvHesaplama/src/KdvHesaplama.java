import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double fiyat,kdv1,kdv2,fiyatKdv;
        kdv1 = 0.18;
        kdv2 = 0.08;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat giriniz : ");
        fiyat = input.nextDouble();

        boolean say = fiyat >1000;
        fiyatKdv = say ? (fiyat += fiyat * kdv1) : (fiyat += fiyat * kdv2);

        System.out.println("fiyat : " +fiyatKdv);s
    }
}
