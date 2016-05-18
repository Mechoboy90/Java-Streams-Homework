import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by programigo on 31.3.2016 г..
 */
public class SumLines {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader bfr = new BufferedReader(new FileReader("D:\\lines.txt"));

        String s;
        int sum = 0;

        while ((s = bfr.readLine()) != null){
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i);
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
