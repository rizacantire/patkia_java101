import java.util.Scanner;

public class DaireninAlanı {
    public static void main(String[] args) {
        double pi=3.14,r,alan,cevre,dilim,dilimAlan;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarı çapı giriniz: ");
        r = input.nextDouble();

        System.out.print("Daire dilimi açısını giriniz : ");
        dilim = input.nextDouble();

        alan = pi * r *r ;
        cevre = 2 * pi*r;

        dilimAlan = (pi*(r*r)*dilim)/360;

        System.out.println("Dairenin çevresi : " +cevre);
        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Daire dilimin alanı " + dilimAlan);


    }
}
