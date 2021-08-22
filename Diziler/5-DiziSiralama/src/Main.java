import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int boyut,gecici;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyunu girin : ");
        boyut = scanner.nextInt();
        int[] dizi = new int [boyut];
        for (int i = 0 ; i<dizi.length; i++){
            System.out.print(i+1 + ". Elemanı giriniz : ");
            dizi[i] = scanner.nextInt();
        }
        int say = dizi[0];

        for(int i = 0; i < dizi.length; i++)
        {
            for(int j = i+1; j < dizi.length; j++)
            {
                if(dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        for (int k : dizi){
            System.out.print(k + " ");
        }
    }
}
