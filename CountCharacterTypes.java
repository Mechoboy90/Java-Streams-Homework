import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by programigo on 1.4.2016 г..
 */
public class CountCharacterTypes {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader bfr = new BufferedReader(new FileReader("D:\\words.txt"));

        String s;
        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationCount = 0;

        while ((s = bfr.readLine()) != null) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a' | s.charAt(i) == 'e' | s.charAt(i) == 'i' | s.charAt(i) == 'o' | s.charAt(i) == 'u') {
                    vowelsCount++;
                }else if (s.charAt(i) == '!' | s.charAt(i) == ',' | s.charAt(i) == '.' | s.charAt(i) == '?'){
                    punctuationCount++;
                }else if (s.charAt(i) == ' ') {
                }else {
                    consonantsCount++;
                }
            }
            System.out.printf("Vowels: %d\n", vowelsCount);
            System.out.printf("Consonants: %d\n", consonantsCount);
            System.out.printf("Punctuation: %d\n", punctuationCount);
        }
    }
}
