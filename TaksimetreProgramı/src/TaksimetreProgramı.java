import java.util.Scanner;

public class TaksimetreProgramı {
    public static void main(String[] args) {
        double yol,ucret,tutar =10;
        ucret = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("Yolu giriniz : ");
        yol = input.nextDouble();

        tutar += yol*ucret;

        tutar = (tutar < 20) ? 20:tutar;
        System.out.println("Tutar : " + tutar);
    }
}
