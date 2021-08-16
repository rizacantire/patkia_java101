import java.util.Scanner;

public class EtkinlikOner {
    public static void main(String[] args) {
        int sicaklik;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava kaç derece ? : ");
        sicaklik = scanner.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else {
            if(sicaklik>=5 && sicaklik<=15){
                System.out.println("Sinemaya gidebilirsiniz.");

            }else if (sicaklik>15 && sicaklik<=25){
                System.out.println("Piknik için çok güzel bir hava");
            }else {
                System.out.println("Yüzmek size iyi gelecek.");
            }
        }
    }
}

