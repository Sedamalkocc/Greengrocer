import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meyve fiyatlarý
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        // Kullanýcýdan alýnacak ürün miktarlarýný ve kilogram fiyatlarýný isteyin
        System.out.println("Kaç kilo armut aldýnýz?");
        double armutKg = scanner.nextDouble();

        System.out.println("Kaç kilo elma aldýnýz?");
        double elmaKg = scanner.nextDouble();

        System.out.println("Kaç kilo domates aldýnýz?");
        double domatesKg = scanner.nextDouble();

        System.out.println("Kaç kilo muz aldýnýz?");
        double muzKg = scanner.nextDouble();

        System.out.println("Kaç kilo patlýcan aldýnýz?");
        double patlicanKg = scanner.nextDouble();

        // Toplam tutarý hesaplayýn
        double toplamTutar = (armutFiyat * armutKg) + (elmaFiyat * elmaKg) + (domatesFiyat * domatesKg) + (muzFiyat * muzKg) + (patlicanFiyat * patlicanKg);

        // Sonucu ekrana yazdýrýn
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");

        scanner.close();
    }
}
