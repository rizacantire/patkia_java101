import java.util.Scanner;

public class Zodyak {
    public static void main(String[] args) {
        int dogumYili,kalan;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz : ");
        dogumYili = scanner.nextInt();

        kalan = dogumYili%12;

        if (kalan==0){
            System.out.print("Çin Burcunuz : Maymun");
        } else if (kalan==1){
            System.out.print("Çin Burcunuz : Horoz");
        }else if (kalan==2){
            System.out.print("Çin Burcunuz : Köpek");
        }else if (kalan==3){
            System.out.print("Çin Burcunuz : Domuz");
        }else if (kalan==4){
            System.out.print("Çin Burcunuz : Fare");
        }else if (kalan==5){
            System.out.print("Çin Burcunuz : Öküz");
        }else if (kalan==6){
            System.out.print("Çin Burcunuz : Kaplan");
        }else if (kalan==7){
            System.out.print("Çin  Burcunuz : Tavşan");
        }else if (kalan==8){
            System.out.print("Çin  Burcunuz : Ejderha");
        }else if (kalan==9){
            System.out.print("Çin  Burcunuz : Yılan");
        }else if (kalan==10){
            System.out.print("Çin  Burcunuz : At");
        }else if (kalan==11){
            System.out.print("Çin  Burcunuz : Koyun");
        }
    }
}
