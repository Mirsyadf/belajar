public class DataType {
    public static void main(String[] args) {

        // Tipe Data Interger:
        int angka1 = 4;
        int angka2 = 5;
        int angka3 = 10;
        int umur = 17;

        // Tipe Data Boolean (True or False)
        boolean pilih = false;
        boolean maju = true;

        // Tipe Data Char (Karakter) / huruf
        char inisial_nama = 'B';
        char kode = 'A';
        char jenis_kelamin = 'L';

        // Tipe Data Byte
        byte number1 = 0;
        byte number2 = 6;
        // Tipe Data Integer untuk kilometer
        int kilometer = 247; // Perubahan " byte " menjadi " int "
        // karena rentang nilai byte adalah -128 hingga 127.
        // Jika ingin mengunakan nilai diluar rentang ini, mungkin bisa tipe data yang lebih besar seperti " int ".
        byte kilometer1 = 56; // Tetap menggunakan byte karena nilai ini dalam rentang yang valid

        // Tipe Data Float
        float berat_badan = 56.7f;
        float tonase = 7.0f;
        float nilai_matematika = 59f;

        // Tippe Data Double
        double waktu_tempuh = 4.5;
        double nilai_ipa = 89.2;

        // Mencetak nilai dari setiap variabel ke layar
        System.out.println("Nilai angka1: " + angka1);
        System.out.println("Nilai angka2: " + angka2);
        System.out.println("Nilai angka3: " + angka3);
        System.out.println("Nilai umur: " + umur);

        System.out.println("Nilai pilih: " + pilih);
        System.out.println("Nilai maju: " + maju);

        System.out.println("Nilai inisial_nama: " + inisial_nama);
        System.out.println("Nilai kode: " + kode);
        System.out.println("Nilai jenis_kelamin: " + jenis_kelamin);

        System.out.println("Nilai number1: " + number1);
        System.out.println("Nilai number2: " + number2);
        System.out.println("Nilai kilometer: " + kilometer);
        System.out.println("Nilai kilometer1: " + kilometer1);

        System.out.println("Nilai berat_badan: " + berat_badan);
        System.out.println("Nilai tonase: " + tonase);
        System.out.println("Nilai nilai_matematika: " + nilai_matematika);

        System.out.println("Nilai waktu_tempuh: " + waktu_tempuh);
        System.out.println("Nilai nilai_ipa: " + nilai_ipa);

    }
}
