package TODO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Fileas {
    protected static BufferedReader in = null;
    protected static boolean running = true;


    public static void main(String[] args) throws IOException {
        try{
            in = new BufferedReader(new FileReader("TODO/test.txt"));
            File file = new File("TODO/test.txt");
            FileInputStream fis = new FileInputStream(file);
            System.out.println("Inside try:");
            System.out.println(fis);
            System.out.println("------------------");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String text = new String(Files.readAllBytes(Paths.get("TODO/test.txt")), StandardCharsets.UTF_8);
        System.out.println("StandardCharsets");
        System.out.println(text);
        System.out.println("------------------");


        File file = new File("TODO/test.txt");
        Scanner scan = new Scanner(file);
        scan.useDelimiter("\\Z");
        String content = scan.next();
        String[] test = new String[]{
                Arrays.toString(content.split("\\s+"))
        };


        System.out.println("Scanner");
        System.out.println(content);
        System.out.println("------------------");

        System.out.println(test[0]);
    }

//    public void findWord(String word){
//        if(content.contains("tomato")){
//            if(in.readLine().contains("tomato")){
//                System.out.println(test[0]);
//            }
//        }
//    }
}
