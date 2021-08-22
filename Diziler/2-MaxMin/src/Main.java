import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int min = list[0];
        int max = list[0];
        int yakin,uzak;

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        yakin = min;
        uzak = max;

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = scanner.nextInt();


        for (int i : list) {
            if (i < sayi) {
                if(i > yakin){
                    yakin = i;
                }
            }
            if (i > sayi) {
                if(i < uzak){
                    uzak = i;
                }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + yakin);
        System.out.println("Girilen sayıdana büyük en yakın sayı :  " + uzak);

    }
}
