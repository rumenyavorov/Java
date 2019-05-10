package Advanced.FileStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
    public static void main(String[] args) {
        String path = "/home/rumen/Desktop/test.txt";
        try (InputStream in = new FileInputStream(path)) {

            int oneByte = in.read();

            while (oneByte >= 0) {
                System.out.printf("%s ",
                        Integer.toBinaryString(oneByte));
                oneByte = in.read();
            }
        }
        catch (IOException e) {

            e.printStackTrace();

        }
    }
}
