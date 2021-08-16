import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {
        int matematik,fizik,turkce,kimya,muzik;
        int gecmeNotu = 55;
        int dersler = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matamatik notunuzu giriniz : ");
        matematik = scanner.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = scanner.nextInt();

        System.out.print("Türkce notunuzu giriniz : ");
        turkce = scanner.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = scanner.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = scanner.nextInt();

        if(matematik<0 || matematik>100){
            matematik = 0;
            dersler--;

        }

        if(fizik<0 || fizik>100){
            fizik = 0;
            dersler--;

        }

        if(turkce<0 || turkce>100){
            turkce = 0;
            dersler--;

        }

        if(kimya<0 || kimya>100){
            kimya = 0;
            dersler--;

        }

        if(muzik<0 || muzik>100){
            muzik = 0;
            dersler--;

        }

        double ortalama = (fizik+matematik+turkce+kimya+muzik) / dersler;
        if(ortalama >= gecmeNotu){
            System.out.println("Geçtiniz");

        }else {
            System.out.println("Kaldınız");
        }

    }
}
