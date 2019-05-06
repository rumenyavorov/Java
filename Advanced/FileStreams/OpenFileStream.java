package Advanced.FileStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class OpenFileStream {
    public static void main(String[] args) throws IOException {
        String path = "/home/rumen/Desktop/duplicity-full-signatures.20190428T125511Z/signature/home/rumen/Desktop/Java/input.txt";

        FileInputStream is = new FileInputStream(path);
        int oneByte = is.read();
        while(oneByte >= 0){
            System.out.println(oneByte);
            oneByte = is.read();
        }
    }
}
