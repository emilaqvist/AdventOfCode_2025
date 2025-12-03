package Day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day2 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/rotations.txt"))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {

                if (currentLine.equals("*")) {
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
