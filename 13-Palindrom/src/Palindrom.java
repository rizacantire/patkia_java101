public class Palindrom {
    static boolean isPalindrom(int number) {
        int temp = number, reversenumber = 0, lastnumber;
        while (temp != 0) {
            lastnumber = temp % 10;
            reversenumber = (reversenumber * 10) + lastnumber;
            temp /= 10;
        }
        if (number == reversenumber) {
            System.out.println("Polindrom Sayı");
            return true;

        } else {
            System.out.println("Polindrom Sayı Değil");
            return false;

        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(187));

    }

}
