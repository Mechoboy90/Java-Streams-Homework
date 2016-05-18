import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * Created by programigo on 2.4.2016 г..
 */
public class CopyJPGFile {
    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\nissan-gtr-r35-car-1680x1050.jpg")));
    }
}
