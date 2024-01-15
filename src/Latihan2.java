public class Latihan2 {

    public static void main(String[] args) {

        int nilai_uts = 60;
        String status="";
        if(nilai_uts==60){
            status = "tidak lulus";
        }
        System.out.println(status);

        /**
         * if..else...
         * contoh : jika hari hujan , maka pakai payung, tetapi kalau tidak hujan tidak pakai payung
         * if (hujan=benar){
         *       pakai_payung = benar;
         * }else{
         *       pakai_payung = salah;
         * }
         */
        boolean hujan = true;
        boolean pakai_payung;
        if(hujan=true) {
            pakai_payung = true;
        }else{
            pakai_payung= false;
        }

        /**
         * jika suhu udara diatas 28 derajat, maka hawanya panas
         * jika suhu tidak diatas 28 derajat, maka hawanya dingin
         */
        int suhu = 30;
        String hawa;
        if(suhu>28) {
            hawa = "panas";
        }else{
            hawa = "dingin";

        }
    }
}
