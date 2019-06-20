package TODO.Test.One;

import java.util.Random;

public class TestExam {
    public String[] randomWord(int length){
        Random rand = new Random();
        StringBuilder word = new StringBuilder(length);
        //loop through all the chars from 'a' to 'z'
        for(int i = 0; i < length; i++){
            word.append((char)('a' + rand.nextInt(26)));
        }

        return new String[]{word.toString()};
    }
}
