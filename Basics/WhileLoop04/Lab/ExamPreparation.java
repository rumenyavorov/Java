package Java.Basics.WhileLoop04.Lab;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade = Integer.parseInt(sc.nextLine());
        double score = 0;
        int badGrade = 0;
        String task = "";
        double poorGr = 0;
        double sum = 0;
        while(true){
            task = sc.nextLine();
            if(task.equals("Enough")) break;
            if(grade < 4) badGrade++;

            sum += grade;
        }

        System.out.printf("Average score");
    }
}
