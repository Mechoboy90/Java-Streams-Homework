import java.io.*;

/**
 * Created by programigo on 31.3.2016 г..
 */
public class AllCapitals {
    public static void main(String[] args )throws FileNotFoundException, IOException {

        BufferedReader bfr = new BufferedReader(new FileReader("D:\\lines.txt"));

        FileWriter flr = new FileWriter("D:\\lines.txt");

        flr.write("Dolen pedal");
        flr.close();
    }
}
