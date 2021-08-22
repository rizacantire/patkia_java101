import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ebob = 0;

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        int i = 1;
        while(i < sayi1)
        {
            if(sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob = " + ebob);

        int max, ekok = 0;
        max = sayi1 * sayi2;
        while(max > 0)
        {
            if(max % sayi1 == 0 && max % sayi2 == 0) {
                ekok = max;
            }
            max--;
        }
        System.out.println("Ekok = " + ekok);
    }
}
