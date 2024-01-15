import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class luassegitigamethod {

    public static void main(String[] args) {
        // Membuat objek BufferedReader untuk membaca input dari pengguna
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Meminta input panjang alas dari pengguna
            System.out.print("Masukkan panjang alas segitiga: ");
            double alas = Double.parseDouble(reader.readLine());

            // Meminta input tinggi segitiga dari pengguna
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = Double.parseDouble(reader.readLine());

            // Menghitung luas segitiga menggunakan metode
            double luasSegitiga = HitungLuasSegitiga(alas, tinggi);

            // Menampilkan hasil
            System.out.println("Luas segitiga adalah: " + luasSegitiga);

            // Meminta input lain
            System.out.print("Masukkan nilai lain: ");
            double nilaiLain = Double.parseDouble(reader.readLine());

            System.out.println("Anda memasukkan: " + nilaiLain);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        } finally {
            // Menutup BufferedReader setelah selesai
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static double HitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
}

