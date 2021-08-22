import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = scanner.nextInt();

        int min = 0;
        int max = 1000;

        for (int i : list) {
            if (i < sayi) {
                if(i > min){
                    min = i;
                }
            }
            if (i > sayi) {
                if(i < max){
                    max = i;
                }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdana büyük en yakın sayı :  " + max);

    }
}
