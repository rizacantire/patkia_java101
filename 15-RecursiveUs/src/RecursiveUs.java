import java.util.Scanner;

public class RecursiveUs {
    public static void main(String[] args) {
        int taban,us;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değerini girin : ");
        taban = scanner.nextInt();

        System.out.print("Üs değerini girin:");
        us = scanner.nextInt();
        int sonuc = carp(taban,us);

        System.out.println(sonuc);
    }

    static int carp(int taban,int us){
        if(us>0){
            return taban * carp(taban,us -1 );
        }else {
            return 1;
        }
    }
}
