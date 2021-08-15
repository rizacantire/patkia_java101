import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        int mat,fizik,kimya,tarih,muzik,ortalama,toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu girin : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu girin : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu girin : ");
        kimya = input.nextInt();

        System.out.print("Tarih notunuzu girin : ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu girin : ");
        muzik = input.nextInt();

        toplam = fizik + mat + tarih + kimya + muzik;
        ortalama = toplam / 5 ;
        System.out.println("Ortalamanız: " + ortalama );

        boolean sonuc = ortalama >= 60;
        System.out.println(sonuc ? "Geçti" : "Kaldı");
    }
}
