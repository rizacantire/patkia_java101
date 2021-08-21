import java.util.Scanner;

public class IkiKuvvet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Sınır sayısını giriniz : ");
        n = scanner.nextInt();
        for (int i= 1;i<=n;i*=2){
            System.out.println("2'nin katları : " + i);
        }

        for (int i= 1;i<=n;i*=4){
            System.out.println("4'nin katları : " + i);
        }

        for (int i= 1;i<=n;i*=5){
            System.out.println("5'nin katları : " + i);
        }


    }
}
