import java.util.Scanner;

public class TamSayiMiKontrolEtme {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayınızı giriniz.");

        double sayi = scan.nextDouble();

        if ((sayi % 1) == 0) {
            System.out.println("Girilen değer tam sayı değil.");
        } else {
            System.out.println("Girelen değer tam sayı.");
        }
    }
}
