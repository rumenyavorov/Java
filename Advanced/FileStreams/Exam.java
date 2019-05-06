package Advanced.FileStreams;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Exam {
    private static final String file = "random.txt";

    public static void main(String[] args) throws IOException {

        FileWriter fw = null;
        StringBuilder res = new StringBuilder();

        Random rand = new Random();
        TestExam ts = new TestExam();
        String[] content = ts.randomWord(rand.nextInt(10));
//        String content2 = ts.randomWord(rand.nextInt(10));

        fw = new FileWriter(file);
        for(int i = 0; i < 10;i++){
            for (String s : content) {
                fw.write(s);
                fw.write("\n");
            }
        }
        fw.flush();
        fw.close();
        System.out.println("Successfully written.");

    }
}