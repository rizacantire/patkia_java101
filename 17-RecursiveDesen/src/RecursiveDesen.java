import java.util.Scanner;

public class RecursiveDesen {
    public static void main(String[] args) {
        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        sayi = scanner.nextInt();
        desen(sayi);
    }

    static void desen(int sayi){
        if(sayi>=0){
            System.out.println(sayi);
            desen(sayi-5);
        }
        System.out.println(sayi);
    }
}
