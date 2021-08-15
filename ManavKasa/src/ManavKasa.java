import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double toplam,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kilogramı : ");
        armut*=scanner.nextDouble();

        System.out.print("Elma kilogramı : ");
        elma*=scanner.nextDouble();

        System.out.print("Domates kilogramı : ");
        domates*=scanner.nextDouble();

        System.out.print("Muz kilogramı : ");
        muz*=scanner.nextDouble();

        System.out.print("Patlıcan kilogramı : ");
        patlican*=scanner.nextDouble();

        toplam = armut+elma+muz+patlican+domates;
        System.out.println("Toplam Tutar : " +toplam);
    }
}
