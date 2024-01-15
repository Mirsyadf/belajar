import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner KB = new Scanner(System.in);
        String dayString1 = null, dayString2 = null, dayString3 = null;

        System.out.println("Masukkan kode hari (1/2/3/4/5) = ");
        int day = KB.nextInt();

        switch (day) {
            case 1:
                dayString1 = "Saturday";
                break;
            case 2:
                dayString2 = "Sunday";
                break;
            case 3:
                dayString3 = "Monday";
                break;
            case 4:
                dayString1 = "Tuesday";
                break;
            case 5:
                dayString2 = "Wednesday";
                break;
            default:
                dayString3 = "Invalid day";
                break;
        }

        // Menambahkan pernyataan print untuk mencetak hasil
        System.out.println("Day 1: " + dayString1);
        System.out.println("Day 2: " + dayString2);
        System.out.println("Day 3: " + dayString3);
    }
}



