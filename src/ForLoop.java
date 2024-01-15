public class ForLoop {

    public static void main(String[] args) {

        // Menampilkan semua angka genap dan  ganjil dari 10 s/d 89
          String status;
          for(int angka = 10; angka < 90; angka++) { // scope: x++, ++x, x--, --x, x=+2
              if (angka % 2 == 0) { // % adalah pembagian sisa contohnya 10 mod 2 = 5 sisa 0
                  status = "angka genap";
              } else {
                  status = "angka ganjil";
              }
              System.out.println(angka + "adalah" + status);
          }
    }
}
