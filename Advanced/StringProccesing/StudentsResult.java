package Advanced.StringProccesing;

import java.util.Arrays;
import java.util.Scanner;

public class StudentsResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("[,\\s-]+");

        String name = input[0];
        String firstResult = input[1];
        String secondResult = input[2];
        String thirdResult = input[3];

        double avg = (Double.valueOf(input[1]) + Double.valueOf(input[2]) + Double.valueOf(input[3])) / 3;

        System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|","Name" , "JAdv", "JavaOOP", "AdvOOP","Average"));
        System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|", input[0], Double.valueOf(input[1]), Double.valueOf(input[2]), Double.valueOf(input[3]), avg));
    }
}