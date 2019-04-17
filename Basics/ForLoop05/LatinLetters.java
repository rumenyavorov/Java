package Java.Basics.ForLoop05;

import java.util.Arrays;

public class LatinLetters {
    public static void main(String[] args) {
        System.out.println("Latin alphabet:");

        for(char letter = 'a'; letter <= 'z'; letter++){
            String a = "yes,no,maybe";
            String[] test = a.split("\\s*,\\s*");
            System.out.println(letter);
            System.out.println(Arrays.toString(test));
        }
    }
}
