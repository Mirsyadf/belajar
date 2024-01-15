import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BelajarString {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("masukan kalimat = ");
        String p = reader.readLine();
        char huruf = 'r';
        int jumlah_huruf=0;
        for (int counter=0;counter<p.length();counter++){
            if(p.charAt(counter)==huruf){
                jumlah_huruf++;

            }
        }
        System.out.println("jumlah huruf r adalah =" +jumlah_huruf);
    }
}
