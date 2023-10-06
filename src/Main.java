import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meyve fiyatlar�
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        // Kullan�c�dan al�nacak �r�n miktarlar�n� ve kilogram fiyatlar�n� isteyin
        System.out.println("Ka� kilo armut ald�n�z?");
        double armutKg = scanner.nextDouble();

        System.out.println("Ka� kilo elma ald�n�z?");
        double elmaKg = scanner.nextDouble();

        System.out.println("Ka� kilo domates ald�n�z?");
        double domatesKg = scanner.nextDouble();

        System.out.println("Ka� kilo muz ald�n�z?");
        double muzKg = scanner.nextDouble();

        System.out.println("Ka� kilo patl�can ald�n�z?");
        double patlicanKg = scanner.nextDouble();

        // Toplam tutar� hesaplay�n
        double toplamTutar = (armutFiyat * armutKg) + (elmaFiyat * elmaKg) + (domatesFiyat * domatesKg) + (muzFiyat * muzKg) + (patlicanFiyat * patlicanKg);

        // Sonucu ekrana yazd�r�n
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");

        scanner.close();
    }
}
