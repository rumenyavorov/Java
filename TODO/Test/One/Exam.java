package TODO.Test.One;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Exam {
    private static final String file = "random.txt";
    private static FileWriter fw;

    public static void main(String[] args) {

        try {
            fw = new FileWriter(file);
            fw.write(Arrays.toString(generateRandomWords(10)).replace("[", "").replace("]", ""));

            fw.flush();
            fw.close();
            System.out.println("Successfully written.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] generateRandomWords(int numberOfWords)
    {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return new String[]{Arrays.toString(randomStrings)};
    }
}
