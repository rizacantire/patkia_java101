import java.util.Scanner;

public class Basamak {
    public static void main(String[] args) {
        int toplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int a = scanner.nextInt();
        while (a !=0){
            int b = a%10;
            a /=10;
            toplam +=b;

        }
        System.out.println("Basamak sayıları toplamı : " + toplam);


    }
}
